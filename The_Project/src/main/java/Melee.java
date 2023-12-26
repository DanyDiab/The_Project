
import static com.raylib.Raylib.*;
import static com.raylib.Jaylib.*;

public class Melee {

//    ethan was here
    private int attackSpeed;
    private int range;
    private int damage;
    private int posX;
    private int posY;


    public Melee(int attackSpeed, int range, int damage, int posX, int posY){
        this.attackSpeed = attackSpeed;
        this.range = range;
        this.damage = damage;
        this.posX = posX;
        this.posY = posY;
    }

    public void attack(){
        DrawLine(this.posX,this.posY,this.posX,this.posY+range,RED);
    }
}
