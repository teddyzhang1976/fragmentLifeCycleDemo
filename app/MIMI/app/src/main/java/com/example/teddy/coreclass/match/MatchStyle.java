package com.example.teddy.coreclass.match;

/**
 * Created by teddy on 2017/10/5.
 * 牌局风格类：
 采样过程中归纳出来的牌局特征。可以反向抽象得来。(采样过程应该归属上级类，因为上级类MatchCharect包含了牌局的静态信息，动态信息类MatchStyle间接依赖静态信息类）
 例如：
 1. 我在做暴击场总结的时候一条特征描述归纳出几个特征信息
 2. 以后把特征信息变量置入牌局风格中
 3. 每种matchtype对象都会拥有一个这个MatchStyle作为特征信息数据库。
 4. 玩牌的过程中就要重数据库把该变量赋值以后后面判断作为依据。
 */

public class MatchStyle {
}
