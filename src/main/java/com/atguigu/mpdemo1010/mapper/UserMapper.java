package com.atguigu.mpdemo1010.mapper;

import com.atguigu.mpdemo1010.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author:yaoxiang
 * @createTime:2021/3/19 0:32
 * @version:1.0
 */
@Repository //对象声明一下交给spring管理
public interface UserMapper extends BaseMapper<User> {
}
