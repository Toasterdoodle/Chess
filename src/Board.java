import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by student on 5/8/18.
 */
public class Board extends JPanel {

    //=====instance fields=====

    private int width, height, size;

    private Piece[][] chessBoard = new Piece[8][8];

    //QUICK INFO:
    //pieces are represented by two numbers
    //the FIRST number represents the TEAM
    //0 is empty
    //1 is white
    //2 is black
    //the SECOND number represents the PIECE
    //1 is a pawn
    //2 is a rook
    //3 is a knight
    //4 is a bishop
    //5 is a queen
    //6 is a king
    //for example, a white pawn would be represented by the number 11
    //a zero simply represents an empty square

    private boolean[][] canMove = new boolean[8][8];
    //creates a new boolean which determines where a piece can move

    private boolean whiteTurn = true;

    private boolean moving = false;

    private Piece movePiece;

    //==========constructor==========

    public Board(int w, int h){

        setSize(w, h);

        this.width = w;
        this.height = h;

        this.size = width / 8;

        setUpBoard();

        //System.out.println(size);

        setUpMouseListener();

        setUpCanMove();

        soutBoard();

    }//end Board

    //==========methods==========

    public void paintComponent(Graphics g){
        //THE ALMIGHTY PAINTCOMPONENT

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;

        //draws the board:

        g2.setColor(new Color(223, 213, 50));

        g2.fillRect(0, 0, width, height);

        g2.setColor(new Color(114, 60, 25));

        for (int r = 0; r < chessBoard.length; r++) {

            for (int c = 0; c < chessBoard[0].length; c++) {

                if((r + c) % 2 == 0){

                    g2.fillRect(r * size, c * size, size, size);

                }//end if

            }//end for

        }//end for

        for (int r = 0; r < chessBoard.length; r++) {

            for (int c = 0; c < chessBoard[0].length; c++) {

                if(chessBoard[r][c] != null){

                    chessBoard[r][c].draw(g2, size);

                }//end if

            }//end for

        }//end for

    }//end paintComponent

    //--------------------

    public void setUpBoard(){
        //sets up the chessBoard

        //initiates black non-pawn pieces
        chessBoard[0][0] = new Piece(0, 0, 2, 2);
        chessBoard[0][1] = new Piece(0, 1, 2, 3);
        chessBoard[0][2] = new Piece(0, 2, 2, 4);
        chessBoard[0][3] = new Piece(0, 3, 2, 5);
        chessBoard[0][4] = new Piece(0, 4, 2, 6);
        chessBoard[0][5] = new Piece(0, 5, 2, 4);
        chessBoard[0][6] = new Piece(0, 6, 2, 3);
        chessBoard[0][7] = new Piece(0, 7, 2, 2);

        //initiates black pawns
        for (int i = 0; i < 8; i++) {

            chessBoard[1][i] = new Piece(1, i, 2, 1);

        }//end for

        //initiates blank spaces
        for (int r = 2; r < 6; r++) {

            for (int c = 0; c < 8; c++) {

                chessBoard[r][c] = null;

            }//end for

        }//end for

        //initiates white non-pawn pieces
        chessBoard[7][0] = new Piece(7, 0, 1, 2);
        chessBoard[7][1] = new Piece(7, 1, 1, 3);
        chessBoard[7][2] = new Piece(7, 2, 1, 4);
        chessBoard[7][3] = new Piece(7, 3, 1, 5);
        chessBoard[7][4] = new Piece(7, 4, 1, 6);
        chessBoard[7][5] = new Piece(7, 5, 1, 4);
        chessBoard[7][6] = new Piece(7, 6, 1, 3);
        chessBoard[7][7] = new Piece(7, 7, 1, 2);

        //initiates white pawns
        for (int i = 0; i < 8; i++) {

            chessBoard[6][i] = new Piece(6, i, 1, 1);

        }//end for

    }//end setUpBoard

    //-------------------------

    public void setUpCanMove(){

        for (int r = 0; r < canMove.length; r++) {

            for (int c = 0; c < canMove[0].length; c++) {

                canMove[r][c] = false;

            }//end for

        }//end for

    }//end setUpCanMove

    //--------------------

    public void soutBoard(){

        String space;

        for (int r = 0; r < chessBoard.length; r++) {

            for (int c = 0; c < chessBoard[0].length; c++) {

                if(chessBoard[r][c] == null){

                    space = "   ";

                }//end if
                else{

                    space = "  ";

                }//end else

                if(chessBoard[r][c] != null) {

                    System.out.print("" + chessBoard[r][c].getTeam() + chessBoard[r][c].getPiece() + space);

                }//end if
                else{

                    System.out.print(space);

                }//end else

            }//end for

            System.out.println();

        }//end for

    }//end soutBoard

    //--------------------

    public void setUpMouseListener(){

        addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

            }//end mouseClicked

            @Override
            public void mousePressed(MouseEvent e) {

                //finds the x and y position of the cursor
                int x = e.getX();
                int y = e.getY();

                //finds the corresponding grid on the chessboard according to the x and y
                int r = y / size;
                int c = x / size;

                //WHITE'S TURN
                if(whiteTurn){

                    if(!moving) {

                        if (chessBoard[r][c].getTeam() == 1) {

                            movePiece = chessBoard[r][c];

                            moving = true;

                        }//end if

                    }//end if

                }//end if

            }//end mousePressed

            @Override
            public void mouseReleased(MouseEvent e) {

            }//end mouseReleased

            @Override
            public void mouseEntered(MouseEvent e) {

            }//end mouseEntered

            @Override
            public void mouseExited(MouseEvent e) {

            }//end mouseExited

        });

    }//end setUpMouseListener

}//end class
