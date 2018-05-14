import java.awt.*;

/**
 * Created by student on 5/9/18.
 */
public class Piece {

    //=====instance fields=====

    private int r, c, team, piece;

    //==========constructor==========

    public Piece(int r, int c, int team, int piece){

        this.r = r;
        this.c = c;
        this.team = team;
        this.piece = piece;

    }//end Piece

    //===========methods==========

    //getters and setter

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        this.piece = piece;
    }

    //----------

    public void draw(Graphics2D g2, int size){

        g2.setStroke(new BasicStroke(5));

        g2.setFont(new Font("Comic Sans", Font.BOLD, 40));

        if(getTeam() == 2) {//black

            if (getPiece() == 1) {//pawn

                g2.setColor(new Color(69, 69, 69));

                g2.fillOval(c * size + 10, r * size + 10, size - 20, size - 20);

                g2.setColor(new Color(255, 255, 255));

                g2.drawOval(c * size + 10, r * size + 10, size - 20, size - 20);

                g2.drawString("P", c * size + 33, r * size + 60);

            }//end if

            //===============

            if (getPiece() == 2) {//rook

                g2.setColor(new Color(69, 69, 69));

                g2.fillOval(c * size + 10, r * size + 10, size - 20, size - 20);

                g2.setColor(new Color(255, 255, 255));

                g2.drawOval(c * size + 10, r * size + 10, size - 20, size - 20);

                g2.drawString("R", c * size + 33, r * size + 60);

            }//end if

            //===============

            if (getPiece() == 3) {//black knight

                g2.setColor(new Color(69, 69, 69));

                g2.fillOval(c * size + 10, r * size + 10, size - 20, size - 20);

                g2.setColor(new Color(255, 255, 255));

                g2.drawOval(c * size + 10, r * size + 10, size - 20, size - 20);

                g2.drawString("H", c * size + 33, r * size + 60);

            }//end if

            //===============

            if (getPiece() == 4) {//bishop

                g2.setColor(new Color(69, 69, 69));

                g2.fillOval(c * size + 10, r * size + 10, size - 20, size - 20);

                g2.setColor(new Color(255, 255, 255));

                g2.drawOval(c * size + 10, r * size + 10, size - 20, size - 20);

                g2.drawString("B", c * size + 33, r * size + 60);

            }//end if

            //===============

            if (getPiece() == 5) {//queen

                g2.setColor(new Color(69, 69, 69));

                g2.fillOval(c * size + 10, r * size + 10, size - 20, size - 20);

                g2.setColor(new Color(255, 255, 255));

                g2.drawOval(c * size + 10, r * size + 10, size - 20, size - 20);

                g2.drawString("Q", c * size + 31, r * size + 60);

            }//end if

            //===============

            if (getPiece() == 6) {//king

                g2.setColor(new Color(69, 69, 69));

                g2.fillOval(c * size + 10, r * size + 10, size - 20, size - 20);

                g2.setColor(new Color(255, 255, 255));

                g2.drawOval(c * size + 10, r * size + 10, size - 20, size - 20);

                g2.drawString("K", c * size + 33, r * size + 60);

            }//end if

        }//end if

        //===============

        if(getTeam() == 1) {//white

            if (getPiece() == 6) {//king

                g2.setColor(new Color(255, 255, 255));

                g2.fillOval(c * size + 10, r * size + 10, size - 20, size - 20);

                g2.setColor(new Color(69, 69, 69));

                g2.drawOval(c * size + 10, r * size + 10, size - 20, size - 20);

                g2.drawString("K", c * size + 33, r * size + 60);

            }//end if

            //===============

            if(getPiece() == 5){//queen

                g2.setColor(new Color(255, 255, 255));

                g2.fillOval(c * size + 10, r * size + 10, size - 20, size - 20);

                g2.setColor(new Color(69, 69, 69));

                g2.drawOval(c * size + 10, r * size + 10, size - 20, size - 20);

                g2.drawString("Q", c * size + 31, r * size + 60);

            }//end if

            //===============

            if(getPiece() == 4){//bishop

                g2.setColor(new Color(255, 255, 255));

                g2.fillOval(c * size + 10, r * size + 10, size - 20, size - 20);

                g2.setColor(new Color(69, 69, 69));

                g2.drawOval(c * size + 10, r * size + 10, size - 20, size - 20);

                g2.drawString("B", c * size + 33, r * size + 60);

            }//end if

            //===============

            if(getPiece() == 3){//knight

                g2.setColor(new Color(255, 255, 255));

                g2.fillOval(c * size + 10, r * size + 10, size - 20, size - 20);

                g2.setColor(new Color(69, 69, 69));

                g2.drawOval(c * size + 10, r * size + 10, size - 20, size - 20);

                g2.drawString("H", c * size + 33, r * size + 60);

            }//end if

            //===============

            if(getPiece() == 1){// pawn

                g2.setColor(new Color(255, 255, 255));

                g2.fillOval(c * size + 10, r * size + 10, size - 20, size - 20);

                g2.setColor(new Color(69, 69, 69));

                g2.drawOval(c * size + 10, r * size + 10, size - 20, size - 20);

                g2.drawString("P", c * size + 33, r * size + 60);

            }//end if

            //===============

            if(getPiece() == 2){//rook

                g2.setColor(new Color(255, 255, 255));

                g2.fillOval(c * size + 10, r * size + 10, size - 20, size - 20);

                g2.setColor(new Color(69, 69, 69));

                g2.drawOval(c * size + 10, r * size + 10, size - 20, size - 20);

                g2.drawString("R", c * size + 33, r * size + 60);

            }//end if

            //===============

        }//end if

    }//end draw

    //----------

    public void moving(boolean[][] canMove){

        if(canMove.length == 8 && canMove[0].length == 8){

            if(getPiece() == 1){//pawn



            }//end if
            else if(getPiece() == 2){//rook



            }//end if
            else if(getPiece() == 3){//knight



            }//end if
            else if(getPiece() == 4){//bishop



            }//end if
            else if(getPiece() == 5){//queen



            }//end if
            else if(getPiece() == 6){//king



            }//end if

        }//end if
        else{

            System.out.println("invalid sized chess board");

        }//end else

    }//end moving

}//end Piece
