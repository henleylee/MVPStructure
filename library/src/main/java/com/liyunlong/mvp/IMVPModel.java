package com.liyunlong.mvp;

/**
 * 负责业务逻辑和实体模型(主要职责是存储、检索、操纵数据)
 * <ul>
 * <li>对外提供业务数据API
 * <li>内部实现本地数据, 网络数据的存取等
 * <li>只有Presenter可以访问，与View隔离
 * </ul>
 *
 * @author liyunlong
 * @date 2017/2/28 15:27
 */
public interface IMVPModel {
}
