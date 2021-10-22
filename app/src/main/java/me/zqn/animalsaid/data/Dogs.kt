package me.zqn.animalsaid.data

import me.zqn.animalsaid.R

class Dogs() {

    fun getDogs(): List<DogInfo> {
        return listOf<DogInfo>(
            DogInfo(R.string.DogeInfo1, R.string.DogeInfo2,R.drawable.guibin),
            DogInfo(R.string.DogeInfo3, R.string.DogeInfo4,R.drawable.bixion),
            DogInfo(R.string.DogeInfo5, R.string.DogeInfo6,R.drawable.bomei),
            DogInfo(R.string.DogeInfo7, R.string.DogeInfo8,R.drawable.jiwawa),
            DogInfo(R.string.DogeInfo9, R.string.DogeInfo10,R.drawable.xuenarui),
            DogInfo(R.string.DogeInfo11, R.string.DogeInfo12,R.drawable.bage),
            DogInfo(R.string.DogeInfo13, R.string.DogeInfo14,R.drawable.luquan),
            DogInfo(R.string.DogeInfo15, R.string.DogeInfo16,R.drawable.keji))
    }
}