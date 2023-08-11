package all.L1048;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    String[] words;
    Map<String, Integer> collect;

    public int longestStrChain(String[] words) {
        int length = words.length;
        this.words = words;
        Arrays.sort(words, (o1, o2) -> o2.length() - o1.length());
        collect = Arrays.stream(words).collect(Collectors.toMap(s -> s, s -> 0, (s1,s2) -> 0));
        int max = 0;
        for (int i = 0; i < length; i++) {
            max = Math.max(max, dfs(words[i]));
        }
        return max;
    }

    public int dfs(String s) {
        int sum = 0;
        int j = 1;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(s, 0, i).append(s.substring(i + 1));
            if (collect.containsKey(stringBuilder.toString())) {
                sum = Math.max(sum,
                        collect.get(stringBuilder.toString()) != 0 ?
                                collect.get(stringBuilder.toString()) : dfs(stringBuilder.toString()));
            }
        }

        if (sum == 0) {
            collect.put(s, 1);
            return 1;
        } else {
            collect.put(s, sum + 1);
            return sum + 1;
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
//        String[] words = {"xbc", "pcxbcf", "xb", "cxbc", "pcxbc"};
//        String[] words = {"a","b","ba","bca","bda","bdca"};
//        String[] words = {"wnyxmflkf","xefx","usqhb","ttmdvv","hagmmn","tmvv","pttmdvv","nmzlhlpr","ymfk","uhpaglmmnn","zckgh","hgmmn","isqxrk","isqrk","nmzlhpr","uysyqhxb","haglmmn","xfx","mm","wymfkf","tmdvv","uhaglmmn","mf","uhaglmmnn","mfk","wnymfkf","powttkmdvv","kwnyxmflkf","xx","rnqbhxsj","uysqhb","pttkmdvv","hmmn","iq","m","ymfkf","zckgdh","zckh","hmm","xuefx","mv","iqrk","tmv","iqk","wnyxmfkf","uysyqhb","v","m","pwttkmdvv","rnqbhsj"};
        String[] words = {"biltnzk","jxwakrfxsifoj","uzdwyaxvcsr","sqqgkhwbf","tnoftkolx","ipmtvxcwe","zsucxrqkhahuo","qngglugvm","kvohqyedig","njoxacsnddwrg","vwtnxw","kjjourlrzpgeem","xcs","pfsgimurs","lsifyg","uzwyxcsr","muzdwcyanxvcstr","teqyrlhbvcv","rkga","tudezgzbnzb","uzwyaxvcsr","qvzkmgfulby","x","muzdwcyianxvcstr","koqyig","gl","aqcacmy","pmvwe","eskofqduddkhykr","pm","saxxd","ds","iemm","tudegzbz","yipsawmxbp","qyrlhbvcv","yxuhwkzvoczoz","zsucxqkahuo","kga","zwziivbijeiig","wffaheemjnjahzdd","zcxkahuo","djjjsulms","plxh","ffpasoizwhtu","zwziivijeii","fyvpzegautteiv","qszaitzfzv","uwoghcy","qqgkhwbf","eteqyrllhbvcvg","qknspkhngorof","qwvzkmgfuljbyz","grkte","grikrnwezryi","xjbpvekneaxn","cy","wnhnyqmpbsum","m","offqllgj","plxhib","omblqcoktkyf","pasw","prsngzx","offlj","rvvudgpixa","djjjjsulmmrs","gt","mpfsgimurs","cxkahuo","ipmtvxcwue","pqrbaoquxqemv","prqqv","tnoftfkolx","jfzzaw","rshquwmrboghccy","ebqhvwewzzmqif","rrd","dvjjjjqsulmmrs","pfsiurs","crnruydj","rvqgeqql","djsums","prbaquqemv","bs","dzytccvny","kce","llfv","jfzaw","qwvzkmgbfuljbyz","kgieph","hnympsum","ewv","vfgel","rklga","llzqbfv","gte","jckqurkg","qngglugm","tudgzbz","ipmvcwe","rr","kkcev","djjjjsulmrs","llqbfv","offqlgj","paswu","tlrlcnnrsrf","jcckqurkg","jjourlpgeem","nvl","shquwmrboghccy","vncfgelm","dgcdgjcksk","vvhvmibflb","juifgeqkaectlcj","scvdl","whcy","yipswmbp","wcy","hbqq","bsth","etjurltvpsuy","dzvytcccevnceyq","apqrbaoquxqemv","kvohuqyediyig","lenybbukzftz","ffpasoiuztwhtu","lzlhzqibfv","wfeemjnjahzdd","djsulms","xtudezgzbnzb","eemjhzdd","scavdil","guchrvaqbe","nvll","sxzfpzjmxvu","dytccvny","grikrnjwezryi","prng","ntvmcwwpzo","laqgcacyxmym","mglosifyg","nynvlqll","vwtn","lh","zhhxducgelhy","prg","kghierph","zsucxrqkhahuom","kvohqydig","eemjhzd","offiqcdllgji","dyc","toflx","dzvytccvney","ghvb","to","guchrvab","wyimthhfzndppwt","elbqhvwewzzmqif","hkghiyerph","hkghiyejrph","hlsioorugbsuu","c","kgierph","bstbghj","prbquqev","mpfsdgimurs","zfpjvu","zfpvu","yxuhwkzvoczfgoz","gel","ntvmcpzo","ekofqduddkhykr","ekofqdddhykr","rqeql","nhnympsum","xhoqlfolk","ipmtvxcwuje","wgmhjhdmnqot","bsh","rvncfgelm","hkahpbb","lzlzqibfv","xoqlfok","tnoftfkogwgplx","ekofqdddkhykr","zwiieii","ujfzzaw","jfzw","djsms","scavdpilj","tnoftfkoglx","ps","vwtnw","scavhdpilj","scayvhdpuilji","pdrshqngzx","crnrud","wmhjhdmnqot","wghmhjhdmnqot","vbyipsawmxbp","qknsapkhngorof","wymthhfzndppwt","wxcs","dzvytccevney","acacmy","dycy","teqyrllhbvcv","uzwyxcs","wmhjhdmnqt","qvzkmgfulbyz","qngglum","zhhxgdyukcgelhy","oj","iljes","bstbh","laqcacxmy","tofx","ke","yivkqoek","djjjsulmrs","lbirdzvttzze","l","zhhxgdukcgelhy","grikvrnjwezryi","bltz","npynvlqll","gvb","okzrs","urbarfkmnlxxn","qsyzaixtzfazv","dytcy","h","kohqyig","hgri","ojdxm","ujfdfzzaw","qyrhbvcv","ebqhvwewzmqif","uzwxcs","lebzf","ysijvkwqmoekromh","wffaeemjnjahzdd","crnrduyndj","ujfdmfzzaw","laqgcacyxmzgym","jjourlrpgeem","kvohqyediyig","lebukzf","zwiijeii","guchrvb","omoktkyf","hpgt","yikoek","ysijvkwqoekromh","tvpo","ysijvkqoekromh","xbgq","d","abmtk","ors","rnrd","xzrugvlzduaxhzc","njoxacjsnddwrg","yipswmxbp","xqsyzaixtzfazv","urbrfknlxxn","sxzfpjxvu","prbaquxqemv","dvjjjjsulmmrs","kviahvqu","urbfknx","qvmgfulby","yikqoek","zsucxrqkhfahuomm","koqyg","djss","moxpfsdgimlurs","qeql","urbrfknlxn","kgieh","qnspkhngorof","plxyhib","scyayvhdpuiljki","vvhvmbflb","lpzluhzqxibfv","kkcbev","hpzgty","nyvlqll","kvahvu","rklgja","ipmtavxcwuje","lbirdzvvttzze","psw","fpasoiwhtu","dgcdgjckk","qknhsapkhngorof","qszaixtzfazv","tvp","abmtvk","uwrboghcy","hbq","crnruyd","etjurltvsuy","etjurltyvpsuy","lenbukzf","teqyrllhbvcvg","ipmvwe","o","crnryduyndj","lbirdzvvqfttzze","tnoftfkowglx","ipmtavxcwujre","omlcoktkyf","rnperyemtmqh","bltnzk","sxzfpzjxvu","uzdwyaxvcstr","bq","rvvugpixa","laqcacxmym","wffeemjnjahzdd","fpvu","xjbpvekngeyaxbn","dzvytccevncey","qgly","scavdl","fw","tox","toftklx","prbaoquxqemv","ztrobzqiukdkcbv","yivkqoekr","feemjnjhzdd","plxhi","cp","fyvpzgauttei","prshqngzx","kplxyrhib","suwrboghcy","kviahvu","mvwe","dzvytccvny","hbqwq","prbquqemv","lzlhzqxibfv","ll","omblcoktkyf","toftlx","lpzlhzqxibfv","tudegzbnz","ddgcdgjcgkspk","kgih","xjbpvekneaxbn","suwrboghccy","zwiiijeii","dytccy","ympsum","jxwakfxsifoj","uwhcy","yxuhwkzvoczfoz","xzfpjvu","lenybbukzft","b","llqfv","laqgcacyxmgym","xq","scavdilj","zwziivbijaeiig","scyayvhdpuilji","amvevfulhsd","dss","tlrlcnnrs","uzwyaxcsr","qspkhngorof","etjurtvsuy","wgqhmhjhhdmnqot","tvmpo","tnoftklx","qgflby","mlosifyg","oqyg","gchvb","t","offqcdllgj","ziieii","zwziivbijeii","vp","lpb","fyvprzegauttejiv","vtn","amefulhsd","llf","muzdwyaxvcstr","zucxqkahuo","pfsgiurs","obstbghj","ipmqtavxcwuzjrbe","djjsulms","qvmgflby","ljpzluhzqxibfv","jjourlrzpgeem","zrugvlduaxhzc","xbpvkneaxn","ljpzluhzgqyxibfv","yivkqoekrh","laqcacyxmym","nyvll","muzdwcyaxvcstr","fyvpzegauttejiv","offlgj","vnfgelm","eteiqyrllhbvcvg","zsucxrqkhahuomm","ibiltnzk","rklgjae","fpasoizwhtu","t","zhhxdukcgelhy","fpasoiwu","xzfpjxvu","tlrlcnnrysrf","ojx","mpum","lxh","eturtvsuy","rklgbjaae","kahpbb","qngglugmfvmp","fielbqtcri","xzruogvlzduaxhzc","rshquwmrbtoghccy","nyvlll","lbirdzvvqttzze","dgcdgjckspk","vvhvmibfilb","dzvytcccevncey","g","vwe","zwxcs","k","jourlpgeem","cpk","cds","tlrlcnnrsr","ivemm","fgel","grktse","urbfknlxn","qwvzkmgfulbyz","xjbpvekngeaxbn","wphuutlgczfspyga","xbq","offqcdllgji","vbyipsakwmxbp","qyrhbvc","ygzpztbno","xhogqlfolk","ujffzzaw","xbnmgq","uwohcy","rnperyemqh","prbqqev","lenybukzf","mxpfsdgimurs","ga","hpt","moxpfsdgimurs","vb","offqcllgj","rklgbjae","lifg","ztrobzzqiukdkcbv","xoqok","cs","snaxxd","cdds","qknhsapkhngorohf","rvqgeql","rnperyemmqh","scavhdpuilji","urbfknlx","rvvugixa","ygzpztbndon","zrugvlzduaxhzc","shuwmrboghccy","mlsifyg","xhoqlfok","wfeemjnjhzdd","lbzf","wythhfzndppwt","mglqosifyg","ojxm","kvohuqyevdiyig","grte","prsngz","eteeiqyrllhbvcvg","dytccny","qngglugfvmp","kohqydig","fu","qgfly","tvmcpzo","tnoftfkowgplx","zruglduaxzc","yijvkqoekrh","xqsyzaixtzfdazv","ipmqtavxcwuzjre","omloktkyf","ympum","lzlzqbfv","pasowu","rvqeql","qngglugvmp","hkghierph","eemjhz","feemnjhzdd","c","yxpuhwkzvoczfgoz","dgcgjckk","lbz","yxuwkzvoczoz","zrugvlduaxzc","ntvmcwpzo","fzw","ygzpmztbndon","rvncfgxelm","mpm","tudezgzbnz","bltzk","ffpasoiuzwhtu","cd","r","okrs","byipsawmxbp","prsqngzx","wnhnyqmpsum","ipmqtavxcwujre","w","fpasoiwtu","plxyrhib","bstbhj","xbnmrgq","ipmtvcwe","urbfkn","nympsum","qtngglugmfvmpt","jckqurg","hgr","hpzgt","rvvxudgpixa","ysijvkqoekrh","lebkzf","guchvb","kvohqyediyg","amvefulhsd","suwmrboghccy","fvu","ibdiltnzk","rnrud","iem","urbarfknlxxn","ygzpztbnon","prsng","zcxqkahuo","ffpeasoiuztwhtu","laqcacmy","qszaitzfazv","xbngq","qvkmgfulby","scavhdpuilj","zsucxrqkahuo","v","qtngglugmfvmp","ysijvkqoekrmh","lfg","prqqev","pasoiwu","p","tvmcpo","kcev","im","crnrduydj","vfgelm","ddgcdgjckspk","ivqemm","ljpzluhzgqxibfv","lenybukzft","nhnyqmpsum","iljesr","hp","tqyrlhbvcv","eemnjhzdd","xbpvekneaxn","wghmhjhhdmnqot","uwboghcy","guchrvabe","xoqfok","fyvpzgautteiv","pg","zwiivijeii","qvgflby","lsifg"};

        System.out.println(solution.longestStrChain(words));



    }
}
