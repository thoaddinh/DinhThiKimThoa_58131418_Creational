
package bt2;

public class MyStringBuilder {
    String str;

    @Override
    public String toString() {
        return "MyStringBuilder{" + "str=" + str + '}';
    }
    
    protected MyStringBuilder(Builder builder){
        this.str = builder.str;
    }
    public static class Builder{
        String str = "chuoi";

        public Builder() {
        }
   
        public Builder addStr(String s) {
            this.str = str + " " + s;
            return this;
        }
        
        public Builder addFloat(float f){
            this.str = str + " " + String.valueOf(f);
            return this;
        }
        
        public Builder addBool(boolean b){
            this.str= str + " " + String.valueOf(b);
            return this;
        }
        
        public MyStringBuilder build(){
            return new MyStringBuilder(this);
        }
    }
}
