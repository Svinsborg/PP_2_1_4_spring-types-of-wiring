package koschei.models;


import org.springframework.beans.factory.annotation.Autowired;

public class Needle7 {

    private Deth8 deth;
    @Autowired
    public Needle7(Deth8 deth) {
        this.deth = deth;
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + "";
    }
}
