package com.ashomok.lullabies;

import android.app.Fragment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Iuliia on 31.03.2016.
 */
public class FragmentFactory {

    public static Map<Integer, FragmentData> trackDataList = new HashMap<Integer, FragmentData>() {{
        put(0, new FragmentData(R.color.baby_deep_blue, R.drawable.lion, R.raw.track1_3));
        put(1, new FragmentData(R.color.baby_white, R.drawable.koala, R.raw.track1_2));
        put(2, new FragmentData(R.color.baby_green, R.drawable.giraffe, R.raw.track1_1));
        put(3, new FragmentData(R.color.baby_yellow, R.drawable.crocodile, R.raw.track1_4));
        put(4, new FragmentData(R.color.baby_blue, R.drawable.elephant, R.raw.track1_5));
        put(5, new FragmentData(R.color.baby_grey, R.drawable.whale, R.raw.track2_1));
        put(6, new FragmentData(R.color.baby_pink, R.drawable.chameleon, R.raw.track2_2));
        put(7, new FragmentData(R.color.baby_blue, R.drawable.turtle, R.raw.track2_3));
        put(8, new FragmentData(R.color.baby_green, R.drawable.monkey, R.raw.track2_4));
        put(9, new FragmentData(R.color.baby_white, R.drawable.penguin, R.raw.track2_5));
    }};

    static Fragment newInstance(int page) {

        Fragment fragment = MusicFragment.newInstance(
                trackDataList.get(page));
        return fragment;
    }
}
