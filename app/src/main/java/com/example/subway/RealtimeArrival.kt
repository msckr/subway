package com.example.subway

import java.io.Serializable

data class RealtimeArrival(
    val arvlCd: String,
    val arvlMsg2: String,
    val arvlMsg3: String,
    val barvlDt: String,
    val beginRow: Any,
    val bstatnId: String,
    val bstatnNm: String,
    val btrainNo: String,
    val btrainSttus: String,
    val curPage: Any,
    val endRow: Any,
    val ordkey: String,
    val pageRow: Any,
    val recptnDt: String,
    val rowNum: Int,
    val selectedCount: Int,
    val statnFid: String,
    val statnId: String,
    val statnList: String,
    val statnNm: String,
    val statnTid: String,
    val subwayHeading: Any,
    val subwayId: String,
    val subwayList: String,
    val subwayNm: Any,
    val totalCount: Int,
    val trainCo: Any,
    val trainLineNm: String,
    val trnsitCo: String,
    val updnLine: String
) : Serializable