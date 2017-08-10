package cn.nexuslink.dao;

import cn.nexuslink.model.ArticalDO;

import java.util.List;

/**
 * Created by 罗浩 on 2017/3/18.
 */
public interface ArticalDao {


    /**
     * 通过文章ID得到文章
     * @param id
     * @return
     */
    public ArticalDO getArticalById(int id);

    /**
     * 该分页的设计思路为，首页展示4篇文章，则传入limit为5，前端收到5篇文章，即可显示查看更多
     * 按钮，并将pagecount+1传入获得下一页文章列表，若返回不足5篇文章，说明没有多余的文章可显示了
     *
     * 获取推荐新闻列表，新闻快讯的推荐位为1，首页图片推荐位为2，重点推荐新闻推荐位为4，要求必须包含图片
     * @param limit  所需文章数
     * @param pageCount 页数
     * @param position   推荐位 1/2/4
     * @return
     */
    public List<ArticalDO> listPositionArtical(int limit, int pageCount, int position);

    /**
     * 获得学院主页中新闻快讯中的文章列表，该列表中的新闻必须含有图片
     * @param limit 所需要的文章数
     * @return
     */

    public List<ArticalDO> getNorArticalsWithPic(int limit);

    /**
     * 返回新闻快讯中的子栏目文章列表，实现分页功能
     * @param cid
     * @param pageCount
     * @param limit 所需要的文章数
     * @return
     */
    public List<ArticalDO> getNorArticalsByCid(int cid, int pageCount, int limit);

    /**
     * 返回重点推荐文章列表
     * @param limit 所需要的文章数
     * @return
     */
    public List<ArticalDO> getImpArticalsWithPic(int limit);

    String getTitle(int id);

}
