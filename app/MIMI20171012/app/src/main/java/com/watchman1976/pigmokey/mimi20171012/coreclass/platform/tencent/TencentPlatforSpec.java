package com.watchman1976.pigmokey.mimi20171012.coreclass.platform.tencent;

/**
 * Created by teddyzhang1976 on 2017-10-20.
 * 本类主要采样天天德州的发牌系统的各种偏向，主要依据是平时打牌的采样统计
 * 注：使用iIndex开头的变量，最大值为100，最小值为0，但可能在计算过程中上下溢出。
 */

public class TencentPlatforSpec {
    /**
     * 特征： 如果听花听顺，却被对手大注攻击，系统往往让你输
     */
    private int indexOfLossWhenDrawSameAndFlashBeenAttack=80;

    /**
     * 特征：竞标赛中断筹码往往被陷阱搞死。
     */
    private int indexOfShortChipperBeenTrapped=80;

    /**
     * 特征：赛命过后，赢的一方接下来如果又拿到好牌，而且之前输的一方不是特短码，赢的一方很可能输
     */
    private int indexOfLossAfterWinAllInAndOpponentIsNowNotShortChipper=80;

    /**
     * 特征：赛命过后，赢的一方接下来如果又拿到好牌，而且之前输的一方是特短码，赢的一方很可能再赢下一局
     */
    private int indexOfWinAfterWinAllInAndOpponentIsNowNotShortChipper=80;


}
