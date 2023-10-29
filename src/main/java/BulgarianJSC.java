import java.util.List;

public class BulgarianJSC extends Company{

    @SuppressWarnings("unchecked")
    @Override
    public BulgarianJSC addRepresentative(BasePerson representative) {

        this.representatives.add(representative);
        return this;
    }

    @Override
    public BulgarianJSC addAllRepresentatives(List<BasePerson> representatives) {

        this.representatives.addAll(representatives);
        return this;
    }

    public BulgarianJSC doNothingJSCSpecific() {
        return this;
    }
}
