import java.util.List;

public class BulgarianLLC extends Company{

    @Override
    public BulgarianLLC addRepresentative(BasePerson representative) {

        this.representatives.add(representative);
        return this;
    }

    @Override
    public BulgarianLLC addAllRepresentatives(List<BasePerson> representatives) {

        this.representatives.addAll(representatives);
        return this;
    }
}
