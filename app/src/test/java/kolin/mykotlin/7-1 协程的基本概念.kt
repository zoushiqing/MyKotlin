package kolin.mykotlin

import org.junit.Test
import java.net.HttpURLConnection

/**
 * desc:
 */
/**
 *协作运行  解决异步问题
 * 应用层完成调度
 * 支持协程的语言 例如:Lua , c#
 * 
 * 伪代码
 * 现在我们要开始运行协程啦{
 *  //现在我们在协程里面了
 *  //花括号内的代码可以是一段运行在UI线程的代码，比如Android初始化UI
 *  val 视图 = 。。。 //初始化视图
 *  //注意,异步加载图片 这个鬼东西看上去像个函数 ，它运行在其他线程
 *  val 图片 = 异步加载图片(图片的地址)
 *  视图.显示图片(图片)
 * 
 * }
 */
class xiecheng{
    @Test
    fun test(){
        HttpURLConnection.HTTP_INTERNAL_ERROR
        
    }
}