public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void changeBuilder(Builder builder){
        this.builder = builder;
    }

    public void make(String type){
        switch (type){
            case "principales":
                builder.buildStepA();
                builder.buildStepB();
                builder.buildStepC();

                break;
            case "segundarios":
                builder.buildStepA();
                builder.buildStepB();
                builder.buildStepC();

                break;
        }
    }


}
