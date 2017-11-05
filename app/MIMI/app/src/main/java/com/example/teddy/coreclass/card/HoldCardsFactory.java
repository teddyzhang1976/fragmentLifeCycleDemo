package com.example.teddy.coreclass.card;

import com.example.teddy.coreclass.card.holdcards.*;

/**
 * Created by teddy on 2017/11/4.
 * 根据不同花色返回手牌对象
 * "方块" = dianmond
 * "红心" = heart
 * "黑桃" = spade
 * "梅花" = clubs
 */

public class HoldCardsFactory {
    public static IHoldCards getHoldCardsObject(String holdcardsString){
        holdcardsString.toLowerCase();
        switch (holdcardsString){
            case "adah":
            case "adas":
            case "adac":
            case "ahas":
            case "ahac":
            case "asac":
                return new HoldCardsAA();
            case "kdkh":
            case "kdks":
            case "kdkc":
            case "khks":
            case "khkc":
            case "kskc":
                return new HoldCardsKK();
            case "qdqh":
            case "qdqs":
            case "qdqc":
            case "qhqs":
            case "qhqc":
            case "qsqc":
                return new HoldCardsQQ();
            case "jdjh":
            case "jdjs":
            case "jdjc":
            case "jhjs":
            case "jhjc":
            case "jsjc":
                return new HoldCardsJJ();
            case "tdth":
            case "tdts":
            case "tdtc":
            case "thts":
            case "thtc":
            case "tstc":
                return new HoldCardsTT();
            case "9d9h":
            case "9d9s":
            case "9d9c":
            case "9h9s":
            case "9h9c":
            case "9s9c":
                return new HoldCards99();
            case "8d8h":
            case "8d8s":
            case "8d8c":
            case "8h8s":
            case "8h8c":
            case "8s8c":
                return new HoldCards88();
            case "7d7h":
            case "7d7s":
            case "7d7c":
            case "7h7s":
            case "7h7c":
            case "7s7c":
                return new HoldCards77();
            case "6d6h":
            case "6d6s":
            case "6d6c":
            case "6h6s":
            case "6h6c":
            case "6s6c":
                return new HoldCards66();
            case "5d5h":
            case "5d5s":
            case "5d5c":
            case "5h5s":
            case "5h5c":
            case "5s5c":
                return new HoldCards55();
            case "4d4h":
            case "4d4s":
            case "4d4c":
            case "4h4s":
            case "4h4c":
            case "4s4c":
                return new HoldCards44();
            case "3d3h":
            case "3d3s":
            case "3d3c":
            case "3h3s":
            case "3h3c":
            case "3s3c":
                return new HoldCards33();
            case "2d2h":
            case "2d2s":
            case "2d2c":
            case "2h2s":
            case "2h2c":
            case "2s2c":
                return new HoldCards22();
            //////////////////////////////////////////////////////
            case "adkd":
            case "ahkh":
            case "ackc":
            case "asks":
                return new HoldCardsAKs();
            case "adkh":
            case "adks":
            case "adkc":
            case "ahks":
            case "ahkc":
            case "askc":
                return new HoldCardsAKo();
            case "adqd":
            case "ahqh":
            case "acqc":
            case "asqs":
                return new HoldCardsAQs();
            case "adqh":
            case "adqs":
            case "adqc":
            case "ahqs":
            case "ahqc":
            case "asqc":
                return new HoldCardsAQo();
            case "adjd":
            case "ahjh":
            case "acjc":
            case "asjs":
                return new HoldCardsAJs();
            case "adjh":
            case "adjs":
            case "adjc":
            case "ahjs":
            case "ahjc":
            case "asjc":
                return new HoldCardsAJo();
            case "adtd":
            case "ahth":
            case "actc":
            case "asts":
                return new HoldCardsATs();
            case "adth":
            case "adts":
            case "adtc":
            case "ahts":
            case "ahtc":
            case "astc":
                return new HoldCardsATo();
            case "ad9d":
            case "ah9h":
            case "ac9c":
            case "as9s":
                return new HoldCardsA9s();
            case "ad9h":
            case "ad9s":
            case "ad9c":
            case "ah9s":
            case "ah9c":
            case "as9c":
                return new HoldCardsA9o();
            case "ad8d":
            case "ah8h":
            case "ac8c":
            case "as8s":
                return new HoldCardsA8s();
            case "ad8h":
            case "ad8s":
            case "ad8c":
            case "ah8s":
            case "ah8c":
            case "as8c":
                return new HoldCardsA8o();
            case "ad7d":
            case "ah7h":
            case "ac7c":
            case "as7s":
                return new HoldCardsA7s();
            case "ad7h":
            case "ad7s":
            case "ad7c":
            case "ah7s":
            case "ah7c":
            case "as7c":
                return new HoldCardsA7o();
            case "ad6d":
            case "ah6h":
            case "ac6c":
            case "as6s":
                return new HoldCardsA6s();
            case "ad6h":
            case "ad6s":
            case "ad6c":
            case "ah6s":
            case "ah6c":
            case "as6c":
                return new HoldCardsA6o();
            case "ad5d":
            case "ah5h":
            case "ac5c":
            case "as5s":
                return new HoldCardsA5s();
            case "ad5h":
            case "ad5s":
            case "ad5c":
            case "ah5s":
            case "ah5c":
            case "as5c":
                return new HoldCardsA5o();
            case "ad4d":
            case "ah4h":
            case "ac4c":
            case "as4s":
                return new HoldCardsA4s();
            case "ad4h":
            case "ad4s":
            case "ad4c":
            case "ah4s":
            case "ah4c":
            case "as4c":
                return new HoldCardsA4o();
            case "ad3d":
            case "ah3h":
            case "ac3c":
            case "as3s":
                return new HoldCardsA3s();
            case "ad3h":
            case "ad3s":
            case "ad3c":
            case "ah3s":
            case "ah3c":
            case "as3c":
                return new HoldCardsA3o();
            case "ad2d":
            case "ah2h":
            case "ac2c":
            case "as2s":
                return new HoldCardsA2s();
            case "ad2h":
            case "ad2s":
            case "ad2c":
            case "ah2s":
            case "ah2c":
            case "as2c":
                return new HoldCardsA2o();
                ////////////////////////////////////
            case "kdqd":
            case "khqh":
            case "kcqc":
            case "ksqs":
                return new HoldCardsKQs();
            case "kdqh":
            case "kdqs":
            case "kdqc":
            case "khqs":
            case "khqc":
            case "ksqc":
                return new HoldCardsKQo();
            case "kdjd":
            case "khjh":
            case "kcjc":
            case "ksjs":
                return new HoldCardsKJs();
            case "kdjh":
            case "kdjs":
            case "kdjc":
            case "khjs":
            case "khjc":
            case "ksjc":
                return new HoldCardsKJo();
            case "kdtd":
            case "khth":
            case "kctc":
            case "ksts":
                return new HoldCardsKTs();
            case "kdth":
            case "kdts":
            case "kdtc":
            case "khts":
            case "khtc":
            case "kstc":
                return new HoldCardsKTo();
            case "kd9d":
            case "kh9h":
            case "kc9c":
            case "ks9s":
                return new HoldCardsK9s();
            case "kd9h":
            case "kd9s":
            case "kd9c":
            case "kh9s":
            case "kh9c":
            case "ks9c":
                return new HoldCardsK9o();
            case "kd8d":
            case "kh8h":
            case "kc8c":
            case "ks8s":
                return new HoldCardsK8s();
            case "kd8h":
            case "kd8s":
            case "kd8c":
            case "kh8s":
            case "kh8c":
            case "ks8c":
                return new HoldCardsK8o();
            case "kd7d":
            case "kh7h":
            case "kc7c":
            case "ks7s":
                return new HoldCardsK7s();
            case "kd7h":
            case "kd7s":
            case "kd7c":
            case "kh7s":
            case "kh7c":
            case "ks7c":
                return new HoldCardsK7o();
            case "kd6d":
            case "kh6h":
            case "kc6c":
            case "ks6s":
                return new HoldCardsK6s();
            case "kd6h":
            case "kd6s":
            case "kd6c":
            case "kh6s":
            case "kh6c":
            case "ks6c":
                return new HoldCardsK6o();
            case "kd5d":
            case "kh5h":
            case "kc5c":
            case "ks5s":
                return new HoldCardsK5s();
            case "kd5h":
            case "kd5s":
            case "kd5c":
            case "kh5s":
            case "kh5c":
            case "ks5c":
                return new HoldCardsK5o();
            case "kd4d":
            case "kh4h":
            case "kc4c":
            case "ks4s":
                return new HoldCardsK4s();
            case "kd4h":
            case "kd4s":
            case "kd4c":
            case "kh4s":
            case "kh4c":
            case "ks4c":
                return new HoldCardsK4o();
            case "kd3d":
            case "kh3h":
            case "kc3c":
            case "ks3s":
                return new HoldCardsK3s();
            case "kd3h":
            case "kd3s":
            case "kd3c":
            case "kh3s":
            case "kh3c":
            case "ks3c":
                return new HoldCardsK3o();
            case "kd2d":
            case "kh2h":
            case "kc2c":
            case "ks2s":
                return new HoldCardsK2s();
            case "kd2h":
            case "kd2s":
            case "kd2c":
            case "kh2s":
            case "kh2c":
            case "ks2c":
                return new HoldCardsK2o();
        }

        return null;
    }
}
