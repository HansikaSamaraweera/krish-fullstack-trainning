package hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

import java.util.function.Supplier;

public class CommonHystrixCommand extends HystrixCommand {

    Supplier<Object> execute;
    Supplier<Object> fallback;

    public CommonHystrixCommand(String gr,  Supplier<Object> execute){
        super(HystrixCommandGroupKey.Factory.asKey(gr));
        this.execute=execute;
    }

    protected CommonHystrixCommand(Setter config,Supplier<Object> execute) {
        super(config);
        this.execute=execute;
    }
    public CommonHystrixCommand(String gr,  Supplier<Object> execute,   Supplier<Object> fallback){
        super(HystrixCommandGroupKey.Factory.asKey(gr));
        this.execute=execute;
        this.fallback=fallback;
    }

    protected CommonHystrixCommand(Setter config,Supplier<Object> execute,   Supplier<Object> fallback) {
        super(config);
        this.execute=execute;
        this.fallback=fallback;
    }

    @Override
    protected Object run() throws Exception {
        return null;
    }
    @Override
    protected Object getFallback(){
        if (fallback!=null){
            return fallback.get();
        }
        return super.getFallback();
    }

}
