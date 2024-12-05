package DiceApp1;

public class Dice {
    int me;

    void roll(){
        me = (int)(Math.random()*6)+1;//1~6の乱数
    }
}