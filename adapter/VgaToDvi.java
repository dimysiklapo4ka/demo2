package adapter;

/**
 * Created by d1mys1klapo4ka on 07.04.2017.
 */
public class VgaToDvi extends Vga implements Dvi{


    @Override
    public void getPicturesDvi() {
        getPicturesVga();
    }
}
