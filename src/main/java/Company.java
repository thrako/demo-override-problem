import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Company extends BasePerson {

    protected Set<BasePerson> representatives = new HashSet<>();

    public Company() {

    }

    public Set<BasePerson> getRepresentatives() {

        return representatives;
    }

    public abstract <T extends Company> T addRepresentative(BasePerson representative);

    //public abstract <T extends Company> T addAllRepresentatives(List<BasePerson> representatives);
    public abstract Company addAllRepresentatives(List<BasePerson> representatives);

    public boolean removeRepresentative(BasePerson representative) {

        return this.representatives.remove(representative);
    }


}
