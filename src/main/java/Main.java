public class Main {

    public static void main(String[] args) {

        new BulgarianLLC()
                .addAllRepresentatives(null)
                .doNothingLLCSpecific()
                .addRepresentative(null)
                .doNothingLLCSpecific();

        new BulgarianJSC()
                .addAllRepresentatives(null)
                .doNothingJSCSpecific()
                .addRepresentative(null)
                .doNothingJSCSpecific();
    }
}
