import java.util.*;
 // pos = posição
public class Main {
    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();
    public static void main(String[] args) {
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}}; // montagem do jogo da velha
        printGameBoard(gameBoard);
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.println("Entre com a sua jogada 1-9:");
            int playerPos = input.nextInt(); // player aposta
            while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPositions)){
                System.out.println("Posição preenchida!, escolha outra posição!");
                playerPos = input.nextInt();
            }

            placePiece(gameBoard, playerPos, "Player");

            String result = checkWinner();
            if(result.length()>0){
                System.out.println(result);
                break;
            }

            Random rand = new Random();
            int cpuPos = rand.nextInt(9)+1; //maquina aposta
            while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPositions)){ // laço de repetição de verificação de posições, para nao ocupar o mesmo local
                System.out.println("Posição preenchida!, escolha outra posição!");
                cpuPos = rand.nextInt(9)+1;
            }
            placePiece(gameBoard, cpuPos, "CPU");
            printGameBoard(gameBoard);

            result = checkWinner();
            if(result.length()>0){
                System.out.println(result);
                break;
            }
        }
    }
    public static void printGameBoard(char [][] gameBoard){
        for (char[] row : gameBoard){
            for (char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void placePiece(char[][] gameBoard, int pos, String user){
        char symbol = ' ';
        if(user.equals("Player")){
            symbol = 'X';
            playerPositions.add(pos);
        }else if(user.equals("CPU")){
            symbol = 'O';
            cpuPositions.add(pos);
        }
        switch (pos){
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }
    public static  String checkWinner(){ // check para vencedor
        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List botRow = Arrays.asList(7,8,9);
        List leftCol = Arrays.asList(1,4,7);
        List midCol = Arrays.asList(2,5,8);
        List rightCol = Arrays.asList(3,6,9);
        List cross1 = Arrays.asList(1,5,9);
        List cross2 = Arrays.asList(7,5,3);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);

        for(List l: winning){
            if (playerPositions.containsAll(l)){
                return "Parabéns, você ganhou!";
            }else if(cpuPositions.contains(l)){
            return "CPU, ganhou!";
            }else if (playerPositions.size()+cpuPositions.size()==9) {
                return "Empate";
            }
        }
        return "";
    }
}