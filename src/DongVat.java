// lop truu tuong sound va diChuyen
abstract class DongVat {
    public abstract void sound();

    // dinh nghia pt di chuyen nhung khong dung den
    public void diChuyen() {

    }
}
//lop meo ke thua dong vat va pt sound
class Meo extends DongVat {
    @Override
    public void sound() {
        System.out.println("meo meo");

    }
}
//lop cho ke thua dong vat va pt sound
class Cho extends DongVat {
    public void sound() {
        System.out.println("gau gau");
    }
        }
