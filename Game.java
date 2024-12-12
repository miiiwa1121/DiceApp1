package DiceApp1;

public class Game {
    Player p;//Playerクラスのインスタンスを保持
    Dice d;//Diceクラスのインスタンスを保持

    Game(){
        p = new Player();//Playerクラスのインスタンスを生成
        d = new Dice();//Diceクラスのインスタンスを生成
    }

    void start(){
        p.turn(d);//Playerクラスのturnメソッドを呼び出す
        System.out.println(d.me);//Diceクラスのmeフィールドを表示
    }
    void judge(Player p){
            if(d.me == 6){
                System.out.println("Win");
            }
            else{
                System.out.println("Lose");
            }
        }
    
}
