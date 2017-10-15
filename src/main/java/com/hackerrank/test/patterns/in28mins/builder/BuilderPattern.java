package com.hackerrank.test.patterns.in28mins.builder;

/**
 * Created by jackalhan on 10/14/17.
 */
public class BuilderPattern {

    static class Coffee {

        private String type;
        private boolean sugar;
        private boolean milk;
        private String size;

        private Coffee(Builder builder) {
            this.type = builder.type;
            this.sugar = builder.sugar;
            this.milk = builder.milk;
            this.size = builder.size;
        }


        public static class Builder {

            private String type;
            private boolean sugar;
            private boolean milk;
            private String size;


            public Builder(String type) {
                this.type = type;
            }

            public Builder addSugar(boolean value) {
                this.sugar = value;
                return this;
            }

            public Builder addMilk(boolean value) {
                this.milk = value;
                return this;
            }

            public Builder size(String size) {
                this.size = size;
                return this;
            }

            public Coffee build() {
                return new Coffee(this);
            }


        }
    }

    public static void main(String[] args){
        Coffee turkishCoffee = new Coffee.Builder("Turkish").addMilk(false).addSugar(true).size("Large").build();

        System.out.println(turkishCoffee.size);

    }
}
