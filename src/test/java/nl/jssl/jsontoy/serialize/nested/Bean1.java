package nl.jssl.jsontoy.serialize.nested;

public class Bean1 {
    private String data1;
    private Bean2 bean2;

    public String getData1() {
        return data1;
    }

    public void setData1(String data1) {
        this.data1 = data1;
    }

    public Bean2 getBean2() {
        return bean2;
    }

    public void setBean2(Bean2 bean2) {
        this.bean2 = bean2;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((data1 == null) ? 0 : data1.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bean1 other = (Bean1) obj;
        if (data1 == null) {
            if (other.data1 != null)
                return false;
        } else if (!data1.equals(other.data1))
            return false;
        return true;
    }

}
