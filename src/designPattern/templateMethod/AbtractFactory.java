package designPattern.templateMethod;

/**
 * Created by 0915183 on 2015-11-09.
 */
public abstract class AbtractFactory {

    public void exec() {
        init();
        make();
        destory();
    }

    protected abstract void init();
    protected abstract void make();
    protected abstract void destory();
}
