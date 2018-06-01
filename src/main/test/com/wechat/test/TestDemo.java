package com.wechat.test;

import org.junit.Test;

import cn.hutool.http.HttpUtil;

public class TestDemo {
    @Test
    public void getToken(){
	String wx_appid="wxd63c9118c9916dfa";
	String wx_appsecret="5997ae0d150e6ce8d343052c1819b6ba";
	String url="https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+wx_appid+"&secret="+wx_appsecret;
	String ret=HttpUtil.get(url);
	System.out.println(ret);
	//10_2agBhz30MAMYMMtdgm8P6Yg7DtsrQYZBa-Z0eT78vMA73U0i9w6auc2tQDTQbidKbrV3eAUwb-kLS4Q-W44tQjWOYa703NV7Dft3DrIl777SjvtXW_8T-x993IeZhYx3zleuMUoUG6K9gYchMCXgAJADTO
	//{"access_token":"10_2agBhz30MAMYMMtdgm8P6Yg7DtsrQYZBa-Z0eT78vMA73U0i9w6auc2tQDTQbidKbrV3eAUwb-kLS4Q-W44tQjWOYa703NV7Dft3DrIl777SjvtXW_8T-x993IeZhYx3zleuMUoUG6K9gYchMCXgAJADTO","expires_in":7200}
    }
}
