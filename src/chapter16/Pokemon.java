package chapter16;

public class Pokemon {

    //フィールド
    private String name;
    private int level;

    //コンストラクタ
    public Pokemon(String name){
        this.name = name;
    }

    //getterメソッド (フィールド値を取り出すだけ)
    public String getName(){
        return this.name;
    }
    public int getLevel() {
        return this.level;
    }

    //setterメソッド(フィールド値を更新するだけ)
    public void setName(String set_name) {
        this.name = set_name;
    }
    public void setLevel(int set_level) {
        this.level = set_level;
    }
}
