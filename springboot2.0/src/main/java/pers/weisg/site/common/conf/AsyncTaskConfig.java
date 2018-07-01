package pers.weisg.site.common.conf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Description:异步任务配置
 * author WEISANGENG531
 * Date 2018/6/30
 */
@Configuration
@EnableAsync // 开启异步调用 多线程
public class AsyncTaskConfig implements AsyncConfigurer {
    private static final Logger logger = LoggerFactory.getLogger(AsyncTaskConfig.class);
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();// 新建一个任务执行器
        taskExecutor.setCorePoolSize(10);//核心线程数目
        taskExecutor.setMaxPoolSize(64); // 设置最大的线程数量
        taskExecutor.setQueueCapacity(32);// 等待队列
        /**
         * rejection-policy：当pool已经达到max size的时候，如何处理新任务
         * CALLER_RUNS：不在新线程中执行任务，而是由调用者所在的线程来执行
         * 对拒绝task的处理策略
         */
        taskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        taskExecutor.setKeepAliveSeconds(60);//线程空闲后的最大存活时间
        taskExecutor.initialize();//加载
        return taskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
