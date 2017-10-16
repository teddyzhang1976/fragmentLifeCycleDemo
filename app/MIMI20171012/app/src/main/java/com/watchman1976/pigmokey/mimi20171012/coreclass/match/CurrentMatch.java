package com.watchman1976.pigmokey.mimi20171012.coreclass.match;

/**
 * Created by teddyzhang1976 on 2017-10-12.
 * 1. 用户在主界面初始化当前比赛静态信息（generalMatchInfo）
 * 2. 该类接管比赛控制。
 * 3. 该类同时更新比赛动态信息。
 */

public class CurrentMatch {
    private static final CurrentMatch ourInstance = new CurrentMatch();

    public static CurrentMatch getInstance() {
        return ourInstance;
    }

    private CurrentMatch() {
    }
}
