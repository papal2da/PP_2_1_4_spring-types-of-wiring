package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {
    @Autowired
    public Deth8 getDeathBean() {
        return new Deth8();
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( ";
    }
}
