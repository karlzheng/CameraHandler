package v01;

public class Param {
    private String name;
    private int minVal;
    private int maxVal;
    private int val;

    public Param(String name, int minVal, int maxVal) {
        this.name = name;
        this.minVal = minVal;
        this.maxVal = maxVal;
    }

    public Param(Param param) {
        this.name = param.name;
        this.minVal = param.minVal;
        this.maxVal = param.maxVal;
        this.val = param.val;
    }

    public String getName() {
        return name;
    }

    public int getMinVal() {
        return minVal;
    }

    public int getMaxVal() {
        return maxVal;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}
