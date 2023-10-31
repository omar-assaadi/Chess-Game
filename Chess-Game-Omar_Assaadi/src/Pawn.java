public class Pawn extends Piece {
    public Pawn(int x, int y, Side side, Board board) {
        super(x,y,side,board);
    }

    @Override
    public boolean canMove(int destX, int destY) {
        boolean z=false;
        if (board.get(this.x,this.y).getSide()==(Side.WHITE)) {

            if ((this.y == 6) && (destY == this.y - 2) && (destX == this.x) && (board.get(destX, destY) == null)) {

                    z=true;


                }

            if ((destY == this.y - 1) && (destX == this.x - 1) && (board.get(destX, destY) != null)
                    && (board.get(destX, destY).getSide()!=((board.get(this.x, this.y).getSide())))) {

                z=true;



            }
            if ((destY == this.y - 1) && (destX == this.x + 1) && (board.get(destX , destY ) != null)
                    && (board.get(destX, destY).getSide()!=((board.get(this.x, this.y).getSide())))) {

                z=true;


            }
            if ((destY == this.y - 1) && (destX == this.x) && (board.get(destX, destY) == null)) {

                z=true;


            }

            return z;

        }

        boolean u=false;
        if (board.get(this.x,this.y).getSide()==(Side.BLACK)) {

            if ((this.y==1)&& (destY==this.y+2) && (destX==this.x)&&(board.get(destX,destY)==null)){

                    u= true;

                }


            if ((destY==this.y+1)&&(destX==this.x+1)&&(board.get(destX,destY)!=null)
                    &&(board.get(destX,destY).getSide()!=((board.get(this.x,this.y).getSide())))){

                u=true;

            }
            if ((destY==this.y+1)&&(destX==this.x-1)&&(board.get(destX,destY)!=null)
                    &&(board.get(destX,destY).getSide()!=((board.get(this.x,this.y).getSide())))){

                u=true;

            }
            if ((destY==this.y+1)&&(destX==this.x)&&(board.get(destX,destY)==null)){

                u= true;

            }


        }

        return u;
    }

    @Override
    public String getSymbol() {
        return this.getSide() == Side.BLACK ?  "♟" : "♙";
    }
}
