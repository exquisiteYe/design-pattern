package xyDemo.study3Builder;

public class BuildDemo {

    private BuildDemo(){

    }

    public static class Builder {
        String name;
        public BuildDemo build() {
            System.out.println("check");
            return new BuildDemo();
        }
        public Builder setName(String name){
            this.name = name;
            return this;
        }
    }

    public static void main(String[] args) {
        BuildDemo buildDemo = new BuildDemo.Builder().setName("xiaodingdang").build();
    }
}
