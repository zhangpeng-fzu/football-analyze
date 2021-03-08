package com.peng.bean;

import java.util.List;

public class MatchResponse {


    /**
     * errorCode : 0
     * errorMessage : 处理成功
     * value : {"resultCount":137,"total":1364,"pages":137,"leagueList":[{"leagueAbbName":"亚冠","leagueId":1,"leagueAllName":"亚洲冠军联赛"},{"leagueAbbName":"澳超","leagueId":2,"leagueAllName":"澳大利亚超级联赛"},{"leagueAbbName":"非洲杯","leagueId":3,"leagueAllName":"非洲杯"},{"leagueAbbName":"亚洲杯","leagueId":4,"leagueAllName":"亚洲杯"},{"leagueAbbName":"亚预赛","leagueId":5,"leagueAllName":"亚洲杯预选赛"},{"leagueAbbName":"巴甲","leagueId":6,"leagueAllName":"巴西甲级联赛"},{"leagueAbbName":"巴西杯","leagueId":7,"leagueAllName":"巴西杯"},{"leagueAbbName":"联合会杯","leagueId":10,"leagueAllName":"联合会杯"},{"leagueAbbName":"金杯赛","leagueId":11,"leagueAllName":"中北美金杯赛"},{"leagueAbbName":"俱乐部赛","leagueId":12,"leagueAllName":"俱乐部友谊赛"},{"leagueAbbName":"美洲杯","leagueId":13,"leagueAllName":"美洲杯"},{"leagueAbbName":"世俱杯","leagueId":14,"leagueAllName":"世界俱乐部杯"},{"leagueAbbName":"荷兰杯","leagueId":15,"leagueAllName":"荷兰杯"},{"leagueAbbName":"荷甲","leagueId":17,"leagueAllName":"荷兰甲级联赛"},{"leagueAbbName":"荷超杯","leagueId":18,"leagueAllName":"荷兰超级杯"},{"leagueAbbName":"欧青赛","leagueId":19,"leagueAllName":"欧洲U21锦标赛"},{"leagueAbbName":"英冠","leagueId":20,"leagueAllName":"英格兰冠军联赛"},{"leagueAbbName":"英甲","leagueId":21,"leagueAllName":"英格兰甲级联赛"},{"leagueAbbName":"英乙","leagueId":22,"leagueAllName":"英格兰乙级联赛"},{"leagueAbbName":"英足总杯","leagueId":23,"leagueAllName":"英格兰足总杯"},{"leagueAbbName":"英联赛杯","leagueId":24,"leagueAllName":"英格兰联赛杯"},{"leagueAbbName":"英超","leagueId":25,"leagueAllName":"英格兰超级联赛"},{"leagueAbbName":"社区盾杯","leagueId":26,"leagueAllName":"英格兰社区盾杯"},{"leagueAbbName":"欧洲杯","leagueId":27,"leagueAllName":"欧洲杯"},{"leagueAbbName":"欧预赛","leagueId":28,"leagueAllName":"欧洲杯预选赛"},{"leagueAbbName":"法超杯","leagueId":29,"leagueAllName":"法国超级杯"},{"leagueAbbName":"法国杯","leagueId":30,"leagueAllName":"法国杯"},{"leagueAbbName":"法联赛杯","leagueId":31,"leagueAllName":"法国联赛杯"},{"leagueAbbName":"法甲","leagueId":32,"leagueAllName":"法国甲级联赛"},{"leagueAbbName":"德乙","leagueId":34,"leagueAllName":"德国乙级联赛"},{"leagueAbbName":"德国杯","leagueId":36,"leagueAllName":"德国杯"},{"leagueAbbName":"德甲","leagueId":37,"leagueAllName":"德国甲级联赛"},{"leagueAbbName":"意大利杯","leagueId":38,"leagueAllName":"意大利杯"},{"leagueAbbName":"国际赛","leagueId":39,"leagueAllName":"国际赛"},{"leagueAbbName":"意甲","leagueId":40,"leagueAllName":"意大利甲级联赛"},{"leagueAbbName":"意超杯","leagueId":41,"leagueAllName":"意大利超级杯"},{"leagueAbbName":"日职","leagueId":42,"leagueAllName":"日本职业联赛"},{"leagueAbbName":"日乙","leagueId":43,"leagueAllName":"日本乙级联赛"},{"leagueAbbName":"天皇杯","leagueId":45,"leagueAllName":"日本天皇杯"},{"leagueAbbName":"日联赛杯","leagueId":46,"leagueAllName":"日本联赛杯"},{"leagueAbbName":"日超杯","leagueId":47,"leagueAllName":"日本超级杯"},{"leagueAbbName":"韩职","leagueId":48,"leagueAllName":"韩国职业联赛"},{"leagueAbbName":"解放者杯","leagueId":49,"leagueAllName":"南美解放者杯"},{"leagueAbbName":"美职足","leagueId":50,"leagueAllName":"美国职业大联盟"},{"leagueAbbName":"挪超","leagueId":51,"leagueAllName":"挪威超级联赛"},{"leagueAbbName":"挪威杯","leagueId":52,"leagueAllName":"挪威杯"},{"leagueAbbName":"葡萄牙杯","leagueId":54,"leagueAllName":"葡萄牙杯"},{"leagueAbbName":"葡超","leagueId":55,"leagueAllName":"葡萄牙超级联赛"},{"leagueAbbName":"葡联赛杯","leagueId":56,"leagueAllName":"葡萄牙联赛杯"},{"leagueAbbName":"葡超杯","leagueId":57,"leagueAllName":"葡萄牙超级杯"},{"leagueAbbName":"瑞超","leagueId":58,"leagueAllName":"瑞典超级联赛"},{"leagueAbbName":"东南亚锦","leagueId":59,"leagueAllName":"东南亚锦标赛"},{"leagueAbbName":"苏足总杯","leagueId":60,"leagueAllName":"苏格兰足总杯"},{"leagueAbbName":"国王杯","leagueId":61,"leagueAllName":"西班牙国王杯"},{"leagueAbbName":"西甲","leagueId":62,"leagueAllName":"西班牙甲级联赛"},{"leagueAbbName":"苏联赛杯","leagueId":63,"leagueAllName":"苏格兰联赛杯"},{"leagueAbbName":"苏超","leagueId":64,"leagueAllName":"苏格兰超级联赛"},{"leagueAbbName":"西超杯","leagueId":66,"leagueAllName":"西班牙超级杯"},{"leagueAbbName":"瑞典杯","leagueId":67,"leagueAllName":"瑞典杯"},{"leagueAbbName":"欧冠","leagueId":69,"leagueAllName":"欧洲冠军联赛"},{"leagueAbbName":"欧罗巴","leagueId":70,"leagueAllName":"欧罗巴联赛"},{"leagueAbbName":"欧超杯","leagueId":71,"leagueAllName":"欧洲超级杯"},{"leagueAbbName":"世界杯","leagueId":72,"leagueAllName":"世界杯"},{"leagueAbbName":"世预赛","leagueId":73,"leagueAllName":"世界杯预选赛"},{"leagueAbbName":"女世界杯","leagueId":74,"leagueAllName":"女足世界杯"},{"leagueAbbName":"世青赛","leagueId":75,"leagueAllName":"世界U20锦标赛"},{"leagueAbbName":"杯赛","leagueId":76,"leagueAllName":"杯赛"},{"leagueAbbName":"阿甲","leagueId":77,"leagueAllName":"阿根廷甲级联赛"},{"leagueAbbName":"四强赛","leagueId":78,"leagueAllName":"东亚四强赛"},{"leagueAbbName":"荷乙","leagueId":80,"leagueAllName":"荷兰乙级联赛"},{"leagueAbbName":"法乙","leagueId":81,"leagueAllName":"法国乙级联赛"},{"leagueAbbName":"德超杯","leagueId":82,"leagueAllName":"德国超级杯"},{"leagueAbbName":"亚运男足","leagueId":83,"leagueAllName":"亚运会男足"},{"leagueAbbName":"瑞超杯","leagueId":84,"leagueAllName":"瑞典超级杯"},{"leagueAbbName":"挪超杯","leagueId":85,"leagueAllName":"挪威超级杯"},{"leagueAbbName":"英锦标赛","leagueId":86,"leagueAllName":"英格兰锦标赛"},{"leagueAbbName":"公开赛杯","leagueId":87,"leagueAllName":"美国公开赛杯"},{"leagueAbbName":"俱乐部杯","leagueId":88,"leagueAllName":"南美俱乐部杯"},{"leagueAbbName":"优胜者杯","leagueId":89,"leagueAllName":"南美优胜者杯"},{"leagueAbbName":"中北美冠","leagueId":90,"leagueAllName":"中北美冠军联赛"},{"leagueAbbName":"欧青预赛","leagueId":92,"leagueAllName":"欧洲U21预选赛"},{"leagueAbbName":"奥运男足","leagueId":93,"leagueAllName":"奥运会男足"},{"leagueAbbName":"奥运女足","leagueId":94,"leagueAllName":"奥运会女足"},{"leagueAbbName":"女四强赛","leagueId":95,"leagueAllName":"东亚女足四强赛"},{"leagueAbbName":"阿根廷杯","leagueId":96,"leagueAllName":"阿根廷杯"},{"leagueAbbName":"阿超杯","leagueId":97,"leagueAllName":"阿根廷超级杯"},{"leagueAbbName":"圣保罗锦","leagueId":98,"leagueAllName":"巴西圣保罗州锦赛"},{"leagueAbbName":"俄超","leagueId":100,"leagueAllName":"俄罗斯超级联赛"},{"leagueAbbName":"智利甲","leagueId":101,"leagueAllName":"智利甲级联赛"},{"leagueAbbName":"墨超","leagueId":102,"leagueAllName":"墨西哥超级联赛"},{"leagueAbbName":"俄罗斯杯","leagueId":103,"leagueAllName":"俄罗斯杯"},{"leagueAbbName":"智利杯","leagueId":104,"leagueAllName":"智利杯"},{"leagueAbbName":"墨西哥杯","leagueId":105,"leagueAllName":"墨西哥杯"},{"leagueAbbName":"亚运女足","leagueId":106,"leagueAllName":"亚运会女足"},{"leagueAbbName":"国冠杯","leagueId":108,"leagueAllName":"国际冠军杯"},{"leagueAbbName":"俄超杯","leagueId":109,"leagueAllName":"俄罗斯超级杯"},{"leagueAbbName":"墨超杯","leagueId":110,"leagueAllName":"墨西哥超级杯"},{"leagueAbbName":"智超杯","leagueId":111,"leagueAllName":"智利超级杯"},{"leagueAbbName":"墨冠杯","leagueId":112,"leagueAllName":"墨西哥冠军杯"},{"leagueAbbName":"澳杯","leagueId":114,"leagueAllName":"澳大利亚杯"},{"leagueAbbName":"比甲","leagueId":116,"leagueAllName":"比利时甲级联赛"},{"leagueAbbName":"比利时杯","leagueId":117,"leagueAllName":"比利时杯"},{"leagueAbbName":"亚奥赛","leagueId":118,"leagueAllName":"亚洲U23锦标赛"},{"leagueAbbName":"韩足总杯","leagueId":120,"leagueAllName":"韩国足总杯"},{"leagueAbbName":"比超杯","leagueId":122,"leagueAllName":"比利时超级杯"},{"leagueAbbName":"中国杯","leagueId":123,"leagueAllName":"中国杯"},{"leagueAbbName":"女欧洲杯","leagueId":125,"leagueAllName":"女足欧洲杯"},{"leagueAbbName":"欧国联","leagueId":127,"leagueAllName":"欧洲国家联赛"}],"pageNo":2,"matchResult":[{"a":"7.10","d":"4.25","h":"1.31","matchDate":"2021-02-04","awayTeam":"布城","allAwayTeam":"布里斯托尔城","winFlag":"H","matchResultStatus":"2","sectionsNo999":"3:2","goalLine":"-1","sectionsNo1":"1:1","matchNum":"3011","leagueBackColor":"CC3300","homeTeam":"布伦特","allHomeTeam":"布伦特福德","leagueNameAbbr":"英冠","leagueName":"英格兰冠军联赛","leagueId":20,"homeTeamId":69,"awayTeamId":70,"matchId":1004671,"bettingSingle":0,"matchNumStr":"周三011","poolStatus":"Payout"},{"a":"2.50","d":"3.35","h":"2.28","matchDate":"2021-02-04","awayTeam":"埃弗顿","allAwayTeam":"埃弗顿","winFlag":"A","matchResultStatus":"2","sectionsNo999":"1:2","goalLine":"-1","sectionsNo1":"0:2","matchNum":"3010","leagueBackColor":"FF3333","homeTeam":"利兹联","allHomeTeam":"利兹联","leagueNameAbbr":"英超","leagueName":"英格兰超级联赛","leagueId":25,"homeTeamId":49,"awayTeamId":9,"matchId":1004670,"bettingSingle":0,"matchNumStr":"周三010","poolStatus":"Payout"},{"a":"5.00","d":"3.50","h":"1.53","matchDate":"2021-02-04","awayTeam":"桑托斯","allAwayTeam":"桑托斯","winFlag":"D","matchResultStatus":"2","sectionsNo999":"3:3","goalLine":"-1","sectionsNo1":"1:1","matchNum":"3009","leagueBackColor":"DDDD00","homeTeam":"格雷米奥","allHomeTeam":"格雷米奥","leagueNameAbbr":"巴甲","leagueName":"巴西甲级联赛","leagueId":6,"homeTeamId":791,"awayTeamId":581,"matchId":1004669,"bettingSingle":0,"matchNumStr":"周三009","poolStatus":"Payout"},{"a":"2.70","d":"2.85","h":"2.40","matchDate":"2021-02-04","awayTeam":"蒙彼利埃","allAwayTeam":"蒙彼利埃","winFlag":"D","matchResultStatus":"2","sectionsNo999":"1:1","goalLine":"-1","sectionsNo1":"0:0","matchNum":"3008","leagueBackColor":"6B2B2B","homeTeam":"梅斯","allHomeTeam":"梅斯","leagueNameAbbr":"法甲","leagueName":"法国甲级联赛","leagueId":32,"homeTeamId":183,"awayTeamId":197,"matchId":1004668,"bettingSingle":0,"matchNumStr":"周三008","poolStatus":"Payout"},{"a":"1.80","d":"3.00","h":"4.00","matchDate":"2021-02-04","awayTeam":"里尔","allAwayTeam":"里尔","winFlag":"A","matchResultStatus":"2","sectionsNo999":"0:3","goalLine":"+1","sectionsNo1":"0:0","matchNum":"3007","leagueBackColor":"6B2B2B","homeTeam":"波尔多","allHomeTeam":"波尔多","leagueNameAbbr":"法甲","leagueName":"法国甲级联赛","leagueId":32,"homeTeamId":176,"awayTeamId":180,"matchId":1004667,"bettingSingle":0,"matchNumStr":"周三007","poolStatus":"Payout"},{"a":"2.01","d":"3.25","h":"3.00","matchDate":"2021-02-04","awayTeam":"比利亚雷","allAwayTeam":"比利亚雷亚尔","winFlag":"D","matchResultStatus":"2","sectionsNo999":"0:0","goalLine":"+1","sectionsNo1":"0:0","matchNum":"3006","leagueBackColor":"98CCFF","homeTeam":"莱万特","allHomeTeam":"莱万特","leagueNameAbbr":"国王杯","leagueName":"西班牙国王杯","leagueId":61,"homeTeamId":33,"awayTeamId":679,"matchId":1004687,"bettingSingle":0,"matchNumStr":"周三006","poolStatus":"Payout"},{"a":"1.72","d":"3.30","h":"3.92","matchDate":"2021-02-04","awayTeam":"莱切斯特","allAwayTeam":"莱切斯特城","winFlag":"A","matchResultStatus":"2","sectionsNo999":"0:2","goalLine":"+1","sectionsNo1":"0:2","matchNum":"3005","leagueBackColor":"FF3333","homeTeam":"富勒姆","allHomeTeam":"富勒姆","leagueNameAbbr":"英超","leagueName":"英格兰超级联赛","leagueId":25,"homeTeamId":10,"awayTeamId":50,"matchId":1004666,"bettingSingle":0,"matchNumStr":"周三005","poolStatus":"Payout"},{"a":"","d":"","h":"","matchDate":"2021-02-04","awayTeam":"曼城","allAwayTeam":"曼彻斯特城","winFlag":"","matchResultStatus":"2","sectionsNo999":"0:2","goalLine":"+2","sectionsNo1":"0:2","matchNum":"3004","leagueBackColor":"FF3333","homeTeam":"伯恩利","allHomeTeam":"伯恩利","leagueNameAbbr":"英超","leagueName":"英格兰超级联赛","leagueId":25,"homeTeamId":42,"awayTeamId":12,"matchId":1004665,"bettingSingle":1,"matchNumStr":"周三004","poolStatus":""},{"a":"7.15","d":"4.45","h":"1.29","matchDate":"2021-02-04","awayTeam":"沙尔克04","allAwayTeam":"沙尔克04","winFlag":"H","matchResultStatus":"2","sectionsNo999":"1:0","goalLine":"-1","sectionsNo1":"1:0","matchNum":"3003","leagueBackColor":"A05CA0","homeTeam":"沃夫斯堡","allHomeTeam":"沃尔夫斯堡","leagueNameAbbr":"德国杯","leagueName":"德国杯","leagueId":36,"homeTeamId":154,"awayTeamId":151,"matchId":1004686,"bettingSingle":0,"matchNumStr":"周三003","poolStatus":"Payout"},{"a":"11.00","d":"6.10","h":"1.13","matchDate":"2021-02-04","awayTeam":"波鸿","allAwayTeam":"波鸿","winFlag":"H","matchResultStatus":"2","sectionsNo999":"4:0","goalLine":"-2","sectionsNo1":"2:0","matchNum":"3002","leagueBackColor":"A05CA0","homeTeam":"莱红牛","allHomeTeam":"莱比锡红牛","leagueNameAbbr":"德国杯","leagueName":"德国杯","leagueId":36,"homeTeamId":1619,"awayTeamId":139,"matchId":1004664,"bettingSingle":0,"matchNumStr":"周三002","poolStatus":"Payout"}],"pageSize":10,"lastUpdateTime":"2021-02-08 09:22:07"}
     * emptyFlag : false
     * dataFrom : null
     * success : true
     */

    private String errorCode;
    private String errorMessage;
    /**
     * resultCount : 137
     * total : 1364
     * pages : 137
     * leagueList : [{"leagueAbbName":"亚冠","leagueId":1,"leagueAllName":"亚洲冠军联赛"},{"leagueAbbName":"澳超","leagueId":2,"leagueAllName":"澳大利亚超级联赛"},{"leagueAbbName":"非洲杯","leagueId":3,"leagueAllName":"非洲杯"},{"leagueAbbName":"亚洲杯","leagueId":4,"leagueAllName":"亚洲杯"},{"leagueAbbName":"亚预赛","leagueId":5,"leagueAllName":"亚洲杯预选赛"},{"leagueAbbName":"巴甲","leagueId":6,"leagueAllName":"巴西甲级联赛"},{"leagueAbbName":"巴西杯","leagueId":7,"leagueAllName":"巴西杯"},{"leagueAbbName":"联合会杯","leagueId":10,"leagueAllName":"联合会杯"},{"leagueAbbName":"金杯赛","leagueId":11,"leagueAllName":"中北美金杯赛"},{"leagueAbbName":"俱乐部赛","leagueId":12,"leagueAllName":"俱乐部友谊赛"},{"leagueAbbName":"美洲杯","leagueId":13,"leagueAllName":"美洲杯"},{"leagueAbbName":"世俱杯","leagueId":14,"leagueAllName":"世界俱乐部杯"},{"leagueAbbName":"荷兰杯","leagueId":15,"leagueAllName":"荷兰杯"},{"leagueAbbName":"荷甲","leagueId":17,"leagueAllName":"荷兰甲级联赛"},{"leagueAbbName":"荷超杯","leagueId":18,"leagueAllName":"荷兰超级杯"},{"leagueAbbName":"欧青赛","leagueId":19,"leagueAllName":"欧洲U21锦标赛"},{"leagueAbbName":"英冠","leagueId":20,"leagueAllName":"英格兰冠军联赛"},{"leagueAbbName":"英甲","leagueId":21,"leagueAllName":"英格兰甲级联赛"},{"leagueAbbName":"英乙","leagueId":22,"leagueAllName":"英格兰乙级联赛"},{"leagueAbbName":"英足总杯","leagueId":23,"leagueAllName":"英格兰足总杯"},{"leagueAbbName":"英联赛杯","leagueId":24,"leagueAllName":"英格兰联赛杯"},{"leagueAbbName":"英超","leagueId":25,"leagueAllName":"英格兰超级联赛"},{"leagueAbbName":"社区盾杯","leagueId":26,"leagueAllName":"英格兰社区盾杯"},{"leagueAbbName":"欧洲杯","leagueId":27,"leagueAllName":"欧洲杯"},{"leagueAbbName":"欧预赛","leagueId":28,"leagueAllName":"欧洲杯预选赛"},{"leagueAbbName":"法超杯","leagueId":29,"leagueAllName":"法国超级杯"},{"leagueAbbName":"法国杯","leagueId":30,"leagueAllName":"法国杯"},{"leagueAbbName":"法联赛杯","leagueId":31,"leagueAllName":"法国联赛杯"},{"leagueAbbName":"法甲","leagueId":32,"leagueAllName":"法国甲级联赛"},{"leagueAbbName":"德乙","leagueId":34,"leagueAllName":"德国乙级联赛"},{"leagueAbbName":"德国杯","leagueId":36,"leagueAllName":"德国杯"},{"leagueAbbName":"德甲","leagueId":37,"leagueAllName":"德国甲级联赛"},{"leagueAbbName":"意大利杯","leagueId":38,"leagueAllName":"意大利杯"},{"leagueAbbName":"国际赛","leagueId":39,"leagueAllName":"国际赛"},{"leagueAbbName":"意甲","leagueId":40,"leagueAllName":"意大利甲级联赛"},{"leagueAbbName":"意超杯","leagueId":41,"leagueAllName":"意大利超级杯"},{"leagueAbbName":"日职","leagueId":42,"leagueAllName":"日本职业联赛"},{"leagueAbbName":"日乙","leagueId":43,"leagueAllName":"日本乙级联赛"},{"leagueAbbName":"天皇杯","leagueId":45,"leagueAllName":"日本天皇杯"},{"leagueAbbName":"日联赛杯","leagueId":46,"leagueAllName":"日本联赛杯"},{"leagueAbbName":"日超杯","leagueId":47,"leagueAllName":"日本超级杯"},{"leagueAbbName":"韩职","leagueId":48,"leagueAllName":"韩国职业联赛"},{"leagueAbbName":"解放者杯","leagueId":49,"leagueAllName":"南美解放者杯"},{"leagueAbbName":"美职足","leagueId":50,"leagueAllName":"美国职业大联盟"},{"leagueAbbName":"挪超","leagueId":51,"leagueAllName":"挪威超级联赛"},{"leagueAbbName":"挪威杯","leagueId":52,"leagueAllName":"挪威杯"},{"leagueAbbName":"葡萄牙杯","leagueId":54,"leagueAllName":"葡萄牙杯"},{"leagueAbbName":"葡超","leagueId":55,"leagueAllName":"葡萄牙超级联赛"},{"leagueAbbName":"葡联赛杯","leagueId":56,"leagueAllName":"葡萄牙联赛杯"},{"leagueAbbName":"葡超杯","leagueId":57,"leagueAllName":"葡萄牙超级杯"},{"leagueAbbName":"瑞超","leagueId":58,"leagueAllName":"瑞典超级联赛"},{"leagueAbbName":"东南亚锦","leagueId":59,"leagueAllName":"东南亚锦标赛"},{"leagueAbbName":"苏足总杯","leagueId":60,"leagueAllName":"苏格兰足总杯"},{"leagueAbbName":"国王杯","leagueId":61,"leagueAllName":"西班牙国王杯"},{"leagueAbbName":"西甲","leagueId":62,"leagueAllName":"西班牙甲级联赛"},{"leagueAbbName":"苏联赛杯","leagueId":63,"leagueAllName":"苏格兰联赛杯"},{"leagueAbbName":"苏超","leagueId":64,"leagueAllName":"苏格兰超级联赛"},{"leagueAbbName":"西超杯","leagueId":66,"leagueAllName":"西班牙超级杯"},{"leagueAbbName":"瑞典杯","leagueId":67,"leagueAllName":"瑞典杯"},{"leagueAbbName":"欧冠","leagueId":69,"leagueAllName":"欧洲冠军联赛"},{"leagueAbbName":"欧罗巴","leagueId":70,"leagueAllName":"欧罗巴联赛"},{"leagueAbbName":"欧超杯","leagueId":71,"leagueAllName":"欧洲超级杯"},{"leagueAbbName":"世界杯","leagueId":72,"leagueAllName":"世界杯"},{"leagueAbbName":"世预赛","leagueId":73,"leagueAllName":"世界杯预选赛"},{"leagueAbbName":"女世界杯","leagueId":74,"leagueAllName":"女足世界杯"},{"leagueAbbName":"世青赛","leagueId":75,"leagueAllName":"世界U20锦标赛"},{"leagueAbbName":"杯赛","leagueId":76,"leagueAllName":"杯赛"},{"leagueAbbName":"阿甲","leagueId":77,"leagueAllName":"阿根廷甲级联赛"},{"leagueAbbName":"四强赛","leagueId":78,"leagueAllName":"东亚四强赛"},{"leagueAbbName":"荷乙","leagueId":80,"leagueAllName":"荷兰乙级联赛"},{"leagueAbbName":"法乙","leagueId":81,"leagueAllName":"法国乙级联赛"},{"leagueAbbName":"德超杯","leagueId":82,"leagueAllName":"德国超级杯"},{"leagueAbbName":"亚运男足","leagueId":83,"leagueAllName":"亚运会男足"},{"leagueAbbName":"瑞超杯","leagueId":84,"leagueAllName":"瑞典超级杯"},{"leagueAbbName":"挪超杯","leagueId":85,"leagueAllName":"挪威超级杯"},{"leagueAbbName":"英锦标赛","leagueId":86,"leagueAllName":"英格兰锦标赛"},{"leagueAbbName":"公开赛杯","leagueId":87,"leagueAllName":"美国公开赛杯"},{"leagueAbbName":"俱乐部杯","leagueId":88,"leagueAllName":"南美俱乐部杯"},{"leagueAbbName":"优胜者杯","leagueId":89,"leagueAllName":"南美优胜者杯"},{"leagueAbbName":"中北美冠","leagueId":90,"leagueAllName":"中北美冠军联赛"},{"leagueAbbName":"欧青预赛","leagueId":92,"leagueAllName":"欧洲U21预选赛"},{"leagueAbbName":"奥运男足","leagueId":93,"leagueAllName":"奥运会男足"},{"leagueAbbName":"奥运女足","leagueId":94,"leagueAllName":"奥运会女足"},{"leagueAbbName":"女四强赛","leagueId":95,"leagueAllName":"东亚女足四强赛"},{"leagueAbbName":"阿根廷杯","leagueId":96,"leagueAllName":"阿根廷杯"},{"leagueAbbName":"阿超杯","leagueId":97,"leagueAllName":"阿根廷超级杯"},{"leagueAbbName":"圣保罗锦","leagueId":98,"leagueAllName":"巴西圣保罗州锦赛"},{"leagueAbbName":"俄超","leagueId":100,"leagueAllName":"俄罗斯超级联赛"},{"leagueAbbName":"智利甲","leagueId":101,"leagueAllName":"智利甲级联赛"},{"leagueAbbName":"墨超","leagueId":102,"leagueAllName":"墨西哥超级联赛"},{"leagueAbbName":"俄罗斯杯","leagueId":103,"leagueAllName":"俄罗斯杯"},{"leagueAbbName":"智利杯","leagueId":104,"leagueAllName":"智利杯"},{"leagueAbbName":"墨西哥杯","leagueId":105,"leagueAllName":"墨西哥杯"},{"leagueAbbName":"亚运女足","leagueId":106,"leagueAllName":"亚运会女足"},{"leagueAbbName":"国冠杯","leagueId":108,"leagueAllName":"国际冠军杯"},{"leagueAbbName":"俄超杯","leagueId":109,"leagueAllName":"俄罗斯超级杯"},{"leagueAbbName":"墨超杯","leagueId":110,"leagueAllName":"墨西哥超级杯"},{"leagueAbbName":"智超杯","leagueId":111,"leagueAllName":"智利超级杯"},{"leagueAbbName":"墨冠杯","leagueId":112,"leagueAllName":"墨西哥冠军杯"},{"leagueAbbName":"澳杯","leagueId":114,"leagueAllName":"澳大利亚杯"},{"leagueAbbName":"比甲","leagueId":116,"leagueAllName":"比利时甲级联赛"},{"leagueAbbName":"比利时杯","leagueId":117,"leagueAllName":"比利时杯"},{"leagueAbbName":"亚奥赛","leagueId":118,"leagueAllName":"亚洲U23锦标赛"},{"leagueAbbName":"韩足总杯","leagueId":120,"leagueAllName":"韩国足总杯"},{"leagueAbbName":"比超杯","leagueId":122,"leagueAllName":"比利时超级杯"},{"leagueAbbName":"中国杯","leagueId":123,"leagueAllName":"中国杯"},{"leagueAbbName":"女欧洲杯","leagueId":125,"leagueAllName":"女足欧洲杯"},{"leagueAbbName":"欧国联","leagueId":127,"leagueAllName":"欧洲国家联赛"}]
     * pageNo : 2
     * matchResult : [{"a":"7.10","d":"4.25","h":"1.31","matchDate":"2021-02-04","awayTeam":"布城","allAwayTeam":"布里斯托尔城","winFlag":"H","matchResultStatus":"2","sectionsNo999":"3:2","goalLine":"-1","sectionsNo1":"1:1","matchNum":"3011","leagueBackColor":"CC3300","homeTeam":"布伦特","allHomeTeam":"布伦特福德","leagueNameAbbr":"英冠","leagueName":"英格兰冠军联赛","leagueId":20,"homeTeamId":69,"awayTeamId":70,"matchId":1004671,"bettingSingle":0,"matchNumStr":"周三011","poolStatus":"Payout"},{"a":"2.50","d":"3.35","h":"2.28","matchDate":"2021-02-04","awayTeam":"埃弗顿","allAwayTeam":"埃弗顿","winFlag":"A","matchResultStatus":"2","sectionsNo999":"1:2","goalLine":"-1","sectionsNo1":"0:2","matchNum":"3010","leagueBackColor":"FF3333","homeTeam":"利兹联","allHomeTeam":"利兹联","leagueNameAbbr":"英超","leagueName":"英格兰超级联赛","leagueId":25,"homeTeamId":49,"awayTeamId":9,"matchId":1004670,"bettingSingle":0,"matchNumStr":"周三010","poolStatus":"Payout"},{"a":"5.00","d":"3.50","h":"1.53","matchDate":"2021-02-04","awayTeam":"桑托斯","allAwayTeam":"桑托斯","winFlag":"D","matchResultStatus":"2","sectionsNo999":"3:3","goalLine":"-1","sectionsNo1":"1:1","matchNum":"3009","leagueBackColor":"DDDD00","homeTeam":"格雷米奥","allHomeTeam":"格雷米奥","leagueNameAbbr":"巴甲","leagueName":"巴西甲级联赛","leagueId":6,"homeTeamId":791,"awayTeamId":581,"matchId":1004669,"bettingSingle":0,"matchNumStr":"周三009","poolStatus":"Payout"},{"a":"2.70","d":"2.85","h":"2.40","matchDate":"2021-02-04","awayTeam":"蒙彼利埃","allAwayTeam":"蒙彼利埃","winFlag":"D","matchResultStatus":"2","sectionsNo999":"1:1","goalLine":"-1","sectionsNo1":"0:0","matchNum":"3008","leagueBackColor":"6B2B2B","homeTeam":"梅斯","allHomeTeam":"梅斯","leagueNameAbbr":"法甲","leagueName":"法国甲级联赛","leagueId":32,"homeTeamId":183,"awayTeamId":197,"matchId":1004668,"bettingSingle":0,"matchNumStr":"周三008","poolStatus":"Payout"},{"a":"1.80","d":"3.00","h":"4.00","matchDate":"2021-02-04","awayTeam":"里尔","allAwayTeam":"里尔","winFlag":"A","matchResultStatus":"2","sectionsNo999":"0:3","goalLine":"+1","sectionsNo1":"0:0","matchNum":"3007","leagueBackColor":"6B2B2B","homeTeam":"波尔多","allHomeTeam":"波尔多","leagueNameAbbr":"法甲","leagueName":"法国甲级联赛","leagueId":32,"homeTeamId":176,"awayTeamId":180,"matchId":1004667,"bettingSingle":0,"matchNumStr":"周三007","poolStatus":"Payout"},{"a":"2.01","d":"3.25","h":"3.00","matchDate":"2021-02-04","awayTeam":"比利亚雷","allAwayTeam":"比利亚雷亚尔","winFlag":"D","matchResultStatus":"2","sectionsNo999":"0:0","goalLine":"+1","sectionsNo1":"0:0","matchNum":"3006","leagueBackColor":"98CCFF","homeTeam":"莱万特","allHomeTeam":"莱万特","leagueNameAbbr":"国王杯","leagueName":"西班牙国王杯","leagueId":61,"homeTeamId":33,"awayTeamId":679,"matchId":1004687,"bettingSingle":0,"matchNumStr":"周三006","poolStatus":"Payout"},{"a":"1.72","d":"3.30","h":"3.92","matchDate":"2021-02-04","awayTeam":"莱切斯特","allAwayTeam":"莱切斯特城","winFlag":"A","matchResultStatus":"2","sectionsNo999":"0:2","goalLine":"+1","sectionsNo1":"0:2","matchNum":"3005","leagueBackColor":"FF3333","homeTeam":"富勒姆","allHomeTeam":"富勒姆","leagueNameAbbr":"英超","leagueName":"英格兰超级联赛","leagueId":25,"homeTeamId":10,"awayTeamId":50,"matchId":1004666,"bettingSingle":0,"matchNumStr":"周三005","poolStatus":"Payout"},{"a":"","d":"","h":"","matchDate":"2021-02-04","awayTeam":"曼城","allAwayTeam":"曼彻斯特城","winFlag":"","matchResultStatus":"2","sectionsNo999":"0:2","goalLine":"+2","sectionsNo1":"0:2","matchNum":"3004","leagueBackColor":"FF3333","homeTeam":"伯恩利","allHomeTeam":"伯恩利","leagueNameAbbr":"英超","leagueName":"英格兰超级联赛","leagueId":25,"homeTeamId":42,"awayTeamId":12,"matchId":1004665,"bettingSingle":1,"matchNumStr":"周三004","poolStatus":""},{"a":"7.15","d":"4.45","h":"1.29","matchDate":"2021-02-04","awayTeam":"沙尔克04","allAwayTeam":"沙尔克04","winFlag":"H","matchResultStatus":"2","sectionsNo999":"1:0","goalLine":"-1","sectionsNo1":"1:0","matchNum":"3003","leagueBackColor":"A05CA0","homeTeam":"沃夫斯堡","allHomeTeam":"沃尔夫斯堡","leagueNameAbbr":"德国杯","leagueName":"德国杯","leagueId":36,"homeTeamId":154,"awayTeamId":151,"matchId":1004686,"bettingSingle":0,"matchNumStr":"周三003","poolStatus":"Payout"},{"a":"11.00","d":"6.10","h":"1.13","matchDate":"2021-02-04","awayTeam":"波鸿","allAwayTeam":"波鸿","winFlag":"H","matchResultStatus":"2","sectionsNo999":"4:0","goalLine":"-2","sectionsNo1":"2:0","matchNum":"3002","leagueBackColor":"A05CA0","homeTeam":"莱红牛","allHomeTeam":"莱比锡红牛","leagueNameAbbr":"德国杯","leagueName":"德国杯","leagueId":36,"homeTeamId":1619,"awayTeamId":139,"matchId":1004664,"bettingSingle":0,"matchNumStr":"周三002","poolStatus":"Payout"}]
     * pageSize : 10
     * lastUpdateTime : 2021-02-08 09:22:07
     */

    private ValueBean value;
    private boolean emptyFlag;
    private Object dataFrom;
    private boolean success;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ValueBean getValue() {
        return value;
    }

    public void setValue(ValueBean value) {
        this.value = value;
    }

    public boolean isEmptyFlag() {
        return emptyFlag;
    }

    public void setEmptyFlag(boolean emptyFlag) {
        this.emptyFlag = emptyFlag;
    }

    public Object getDataFrom() {
        return dataFrom;
    }

    public void setDataFrom(Object dataFrom) {
        this.dataFrom = dataFrom;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public static class ValueBean {
        private int resultCount;
        private int total;
        private int pages;
        private int pageNo;
        private int pageSize;
        private String lastUpdateTime;
        /**
         * leagueAbbName : 亚冠
         * leagueId : 1
         * leagueAllName : 亚洲冠军联赛
         */

        private List<LeagueListBean> leagueList;
        /**
         * a : 7.10
         * d : 4.25
         * h : 1.31
         * matchDate : 2021-02-04
         * awayTeam : 布城
         * allAwayTeam : 布里斯托尔城
         * winFlag : H
         * matchResultStatus : 2
         * sectionsNo999 : 3:2
         * goalLine : -1
         * sectionsNo1 : 1:1
         * matchNum : 3011
         * leagueBackColor : CC3300
         * homeTeam : 布伦特
         * allHomeTeam : 布伦特福德
         * leagueNameAbbr : 英冠
         * leagueName : 英格兰冠军联赛
         * leagueId : 20
         * homeTeamId : 69
         * awayTeamId : 70
         * matchId : 1004671
         * bettingSingle : 0
         * matchNumStr : 周三011
         * poolStatus : Payout
         */

        private List<MatchResultBean> matchResult;

        public int getResultCount() {
            return resultCount;
        }

        public void setResultCount(int resultCount) {
            this.resultCount = resultCount;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public int getPageNo() {
            return pageNo;
        }

        public void setPageNo(int pageNo) {
            this.pageNo = pageNo;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public String getLastUpdateTime() {
            return lastUpdateTime;
        }

        public void setLastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
        }

        public List<LeagueListBean> getLeagueList() {
            return leagueList;
        }

        public void setLeagueList(List<LeagueListBean> leagueList) {
            this.leagueList = leagueList;
        }

        public List<MatchResultBean> getMatchResult() {
            return matchResult;
        }

        public void setMatchResult(List<MatchResultBean> matchResult) {
            this.matchResult = matchResult;
        }

        public static class LeagueListBean {
            private String leagueAbbName;
            private int leagueId;
            private String leagueAllName;

            public String getLeagueAbbName() {
                return leagueAbbName;
            }

            public void setLeagueAbbName(String leagueAbbName) {
                this.leagueAbbName = leagueAbbName;
            }

            public int getLeagueId() {
                return leagueId;
            }

            public void setLeagueId(int leagueId) {
                this.leagueId = leagueId;
            }

            public String getLeagueAllName() {
                return leagueAllName;
            }

            public void setLeagueAllName(String leagueAllName) {
                this.leagueAllName = leagueAllName;
            }
        }

        public static class MatchResultBean {
            private String a;
            private String d;
            private String h;
            private String matchDate;
            private String awayTeam;
            private String allAwayTeam;
            private String winFlag;
            private String matchResultStatus;
            private String sectionsNo999;
            private String goalLine;
            private String sectionsNo1;
            private String matchNum;
            private String leagueBackColor;
            private String homeTeam;
            private String allHomeTeam;
            private String leagueNameAbbr;
            private String leagueName;
            private int leagueId;
            private int homeTeamId;
            private int awayTeamId;
            private int matchId;
            private int bettingSingle;
            private String matchNumStr;
            private String poolStatus;

            public String getA() {
                return a;
            }

            public void setA(String a) {
                this.a = a;
            }

            public String getD() {
                return d;
            }

            public void setD(String d) {
                this.d = d;
            }

            public String getH() {
                return h;
            }

            public void setH(String h) {
                this.h = h;
            }

            public String getMatchDate() {
                return matchDate;
            }

            public void setMatchDate(String matchDate) {
                this.matchDate = matchDate;
            }

            public String getAwayTeam() {
                return awayTeam;
            }

            public void setAwayTeam(String awayTeam) {
                this.awayTeam = awayTeam;
            }

            public String getAllAwayTeam() {
                return allAwayTeam;
            }

            public void setAllAwayTeam(String allAwayTeam) {
                this.allAwayTeam = allAwayTeam;
            }

            public String getWinFlag() {
                return winFlag;
            }

            public void setWinFlag(String winFlag) {
                this.winFlag = winFlag;
            }

            public String getMatchResultStatus() {
                return matchResultStatus;
            }

            public void setMatchResultStatus(String matchResultStatus) {
                this.matchResultStatus = matchResultStatus;
            }

            public String getSectionsNo999() {
                return sectionsNo999;
            }

            public void setSectionsNo999(String sectionsNo999) {
                this.sectionsNo999 = sectionsNo999;
            }

            public String getGoalLine() {
                return goalLine;
            }

            public void setGoalLine(String goalLine) {
                this.goalLine = goalLine;
            }

            public String getSectionsNo1() {
                return sectionsNo1;
            }

            public void setSectionsNo1(String sectionsNo1) {
                this.sectionsNo1 = sectionsNo1;
            }

            public String getMatchNum() {
                return matchNum;
            }

            public void setMatchNum(String matchNum) {
                this.matchNum = matchNum;
            }

            public String getLeagueBackColor() {
                return leagueBackColor;
            }

            public void setLeagueBackColor(String leagueBackColor) {
                this.leagueBackColor = leagueBackColor;
            }

            public String getHomeTeam() {
                return homeTeam;
            }

            public void setHomeTeam(String homeTeam) {
                this.homeTeam = homeTeam;
            }

            public String getAllHomeTeam() {
                return allHomeTeam;
            }

            public void setAllHomeTeam(String allHomeTeam) {
                this.allHomeTeam = allHomeTeam;
            }

            public String getLeagueNameAbbr() {
                return leagueNameAbbr;
            }

            public void setLeagueNameAbbr(String leagueNameAbbr) {
                this.leagueNameAbbr = leagueNameAbbr;
            }

            public String getLeagueName() {
                return leagueName;
            }

            public void setLeagueName(String leagueName) {
                this.leagueName = leagueName;
            }

            public int getLeagueId() {
                return leagueId;
            }

            public void setLeagueId(int leagueId) {
                this.leagueId = leagueId;
            }

            public int getHomeTeamId() {
                return homeTeamId;
            }

            public void setHomeTeamId(int homeTeamId) {
                this.homeTeamId = homeTeamId;
            }

            public int getAwayTeamId() {
                return awayTeamId;
            }

            public void setAwayTeamId(int awayTeamId) {
                this.awayTeamId = awayTeamId;
            }

            public int getMatchId() {
                return matchId;
            }

            public void setMatchId(int matchId) {
                this.matchId = matchId;
            }

            public int getBettingSingle() {
                return bettingSingle;
            }

            public void setBettingSingle(int bettingSingle) {
                this.bettingSingle = bettingSingle;
            }

            public String getMatchNumStr() {
                return matchNumStr;
            }

            public void setMatchNumStr(String matchNumStr) {
                this.matchNumStr = matchNumStr;
            }

            public String getPoolStatus() {
                return poolStatus;
            }

            public void setPoolStatus(String poolStatus) {
                this.poolStatus = poolStatus;
            }
        }
    }
}
