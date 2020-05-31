public class User {
    int id;
    String name;
    String psw;

    double x;
    double y;
    static String Gname="卡";
    public User(double _x,double _y){
        x=_x;
        y=_y;
    }

    public double getDistance(User p){
        return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
    }

    public User(int id, String name){
        super();
        this.id=id;
        this.name=name;
    }

    public static void User(){
        System.out.println(Gname);
    }
    public static void main(String[] args) {
        User u1=new User(101,"杨锴");
//        System.out.println(u1.User());
        User p=new User(3.0,4.0);
        User u=new User(0.0,0.0);
        System.out.println(p.getDistance(u));
        System.out.println(u1.name);
        User.User();
        User.Gname="ll";
        User.User();
    }
}
