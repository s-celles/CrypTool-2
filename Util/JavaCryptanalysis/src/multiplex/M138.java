package multiplex;

import common.Utils;

class M138 extends Multiplex{

    private static String[] STRIPS = {
            "DTYLUKCNOIVSEPFQJWRGMBZAXH",
            "LOGKWPRMDUVSYFJNTQIHEAZCBX",
            "YGSKCJETRMUWNHQXIZFAOVBLDP",
            "BERHJYKWCSLNPDZIGFUAOXVQTM",
            "JLSGAOPZEMBVQCUIYDTHXRWFKN",
            "IPWSURJTOQGEVDBMYKLNHAXZFC",
            "CGLXSIBTJHOKNDMQPVRZAYEFUW",
            "YGHKDVLQEXUOASZWPJFBCNRITM",
            "ACZLSOGEDPYWFXHBVIMUKNTJQR",
            "XTHNIBAFEUQSGLJDWOZKMPVCYR",
            "MFKGNURPJZTBQWLCASIHVYOXDE",
            "NHTEPCFDXRYZBAIMSGVJKUOQWL",
            "AHFPGVUKLMNCTSRDEIWZXYQBOJ",
            "SAHIKWDQJNPVUTZCBYLOGFMREX",
            "GPNWMTOSQHJVYKFEALXCIRDBZU",
            "GPCWQOSVZKINJHERUABDTMXLFY",
            "NKAELXYVRDOGZIMTFUBSPJQHWC",
            "EFTXLBCAWHUJGVOMYRSNKDQIZP",
            "ZLNRQBAVYMJUDOTSHXCWGPKIEF",
            "YAGDUTFIXMBWLOJQVNERHKSZPC",
            "THRAWJEMNFKYZCIGOBXVSULDQP",
            "INESDOMTPBQGHYFUZCRVWLKJXA",
            "YIRAELHQOSXGCWTPJVZUNFMDKB",
            "ITLFAXYCMOPVGZHURDBWNSJQKE",
            "QRJGEFWVLKSUHPCXYBMOITNZAD",
            "VYGNODPUJEMFCZIXASKBWHRTLQ",
            "ANZIFPCLOKMHSJDEWVBYQXTURG",
            "NEBZCRMKDPATGLSOWHFIJQVUYX",
            "EQJTZFYSINAUBWCVDXRKHPLGMO",
            "KDOTRBZWIAUYPLNHEGFQSJMCXV",
            "XVSRDIUZFCQTMPLHYEGJAKNWOB",
            "MVELIBQAFGJNPCKWXUSTZRDYHO",
            "BMOITNEWDAUVPHZJXYSLRQCFGK",
            "UYWVFPNHDCRSMZQGXOBTEKLAIJ",
            "LBTNMCYODQIKHSFUJEVARPXWGZ",
            "NFGUQPSTMCKOXJVWELIABRHYZD",
            "CWMFKHPLOVIQXDARBUTEGZJSNY",
            "ITOPAJWHEDZKMCVUXBYQSNLRGF",
            "EODXLUVTSYHMFGAJNWPZQBCIKR",
            "HZACTFNPIXMQRDUBYKVJOGWLES",
            "KYFAZHCLPNQGXWDTVBORUJIMSE",
            "NSWZTGXHKVBPCORLYQEAIJDFUM",
            "XSYLMPKQIZWEANTOVHRDBFUCGJ",
            "XYISKJVQMTRCAUNGZEOHFWLBDP",
            "KDMEPYHGQZTSUVJFXOILRANBWC",
            "GEVKJRNFBXWQPHDOAMTLIZYUCS",
            "MZEKBDFIGQTLJPOWUXSHCRNYVA",
            "AZLETRUFIPJHBXKOSYQMNGDCVW",
            "KNEOJVXFQWCHTDGUMZLYSRAIPB",
            "UIROVSWAGEQXTHZCFYLBDJPKMN",
            "XBDQIFRUVENLHOAZPWGMKJTCSY",
            "BPJZGEVCNTMAOIKHDWSRFUXQLY",
            "CXEDARNFZGLSPWKQHTVIUBMOJY",
            "IZMLCRNWAKTBUHJSPFOEGYQXDV",
            "JOBCRSIAHGZKNYQLDFEPVXWMUT",
            "WPCKJMQTZIELARUBSOXFVYHDNG",
            "KHVUDGMOJWPYRFSQBLZACITNXE",
            "VFIZLTQPMKRACDSOGJXEUNBWYH",
            "GFYVTDQLHWJPKMBAZNIUOSCXER",
            "QKMSFAZBVPHGWIODEXUCNYJLTR",
            "IAPDHNYVFCMOERLUJTQBWSZXKG",
            "ARZOWSMPBKJLVDGUIYNXFHCETQ",
            "DHOXKZWVTCPBRMGIQALYJFUNES",
            "TJFPRHKUWQOMXNIBLYVDZEAGSC",
            "ACBZGTPNSJYDVLXRHOWKUEFMQI",
            "FPHEOKUXNQMZWIVRTCSGBDLJAY",
            "DJABIUXEYQOKRZNSLMPGCTVHFW",
            "AIHDGCNLPQOVTKMJFSRZEBUYXW",
            "JKULTOCZYWNDBIXHQMPSFGEARV",
            "BZJTGQCFKWRPODNLYMSEVHIUAX",
            "CQDBVGIZRNJKFLUXAWYTESPMOH",
            "TADSIQMURKNHYVXCELWOPZGFJB",
            "VSYUFWHJKOBNTIEDRXMLACZPGQ",
            "ILCBVHDKSURWXJNFAEYOPQMGZT",
            "WHVQOLDZPURMGEXTSFYBAICJKN",
            "EZKTAMWIYJQXPLOVBCHNGUDFRS",
            "VCLSBQWEDKGTYIFXHARMZUNPJO",
            "FYAJDGSOVPRCHQWUNITEBKZLMX",
            "BXQWVTCEURIZKAGPNLODFJHMYS",
            "MJPKITCUYZSXBOGLADEWVFQNHR",
            "IZEXRFDHAGSQNPTVBMLWKOUJCY",
            "CTPONKGRMUJWQEYXZVALHIDBFS",
            "HVFBTXSJLNAYPZUQOMRGWICKED",
            "UCSBJDZOTEIQHARVYNWLPMGKFX",
            "LUJHAXCWIRPMVDQNTGBZEFYOKS",
            "AHUKMVEPFNBXYCTORQDSIWZGJL",
            "XWLNYZGIAKJSURDHMQCETFVPBO",
            "VSIJNAXHZLPOQYGRDKMUWFBETC",
            "EMWOFAKYTNQZGXJPLVBRCIUDSH",
            "RSLIHTMPNJXGOCKDUQFAZYWVBE",
            "XCJIGNOKFEHMTADBYWPLSZRUQV",
            "AJCKXTMLDWHEZBNYORUIVGPSQF",
            "RZEWMCBXITNQLYADSOVGFUPHKJ",
            "JMSOVGIPCLYUNDRTFEWQBHXKZA",
            "FYCRPOJNHLSKVUBIDMXAEQZTGW",
            "UXZRBFIQNYLWDKCHSJTPAVEGMO",
            "SRJTMXUZBWGFYDKEVOPAHILQCN",
            "QOHEWVDSTAKJIBNXPGCLRYMZFU",
            "OKSGRZYCDEWVJPAHXFLIMUNBTQ",
            "ULDOMNSRCYGVBPXQWAZJFKEITH"
    };

    int offset;

    M138(int offset) {
        super(STRIPS, 25);
        setOffset(offset);
    }

    M138(){
        this(0);
    }

    M138(int[] key, int offset) {
        this(offset);
        setKey(key);
    }

    void setOffset(int offset) {
        this.offset = offset % STRIP_LENGTH;
        decryptionValid = false;
    }

    Multiplex randomizeOffset() {
        setOffset(1 + Utils.randomNextInt(STRIP_LENGTH) - 1);
        return this;
    }

    @Override
    String offsetString() {
        return String.format("%02d", offset);
    }

    @Override
    int offset(int i) {
        return offset;
    }





}