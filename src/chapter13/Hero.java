package chapter13;

public class Hero  {

    //フィールド (基本的に private をつける)
    public String name;
    public int hp;
    private int mp;
//    String name;
//    int hp;

    //コンストラクタ
    public Hero(String input_name) {
        this.name=input_name;
        this.hp=100;
    }

    //メソッド (基本的に public)
    //眠るメソッド
    public void sleep(){
        this.hp = 100;
        System.out.println(this.name + " は、眠って回復した！");
    }

    //こんにちはメソッド
    public void greeting(){
        System.out.println("こんにちはぁ");
    }

    //さようならメソッド
    public void bye(){
        System.out.println("さようなら");
    }

    //GAMEOVERメソッド
    public void die(){
        System.out.println(this.name+" は、眠りについた");
        System.out.println("----------GAME OVER----------");
    }

    //getterメソッド (フィールド値を取り出すだけ)
    /*
     public フィールドの型 getフィールド名(){
         return this.フィールド名;
     }
    */
    public String getName(){
        return this.name;
    }
    public int getHp(){
        return this.hp;
    }

    //setterメソッド(フィールド値を更新するだけ)
    /*
     public void setフィールド名(フィールドの型 変数名){
         this.フィールド名 = 変数名;
     }
    */

    public void setName(String set_name) {
        this.name = set_name;
    }
    public void setHp(int set_hp){
        this.hp = set_hp;
    }

    /* setterメソッド内に処理を記述できる
     public void setHp(int set_hp){
         if(set_hp < 0){
             throw IllegalArgumentException
                 System.out.println("ありえない値のため処理を中断")
         }
     }
    */
}
