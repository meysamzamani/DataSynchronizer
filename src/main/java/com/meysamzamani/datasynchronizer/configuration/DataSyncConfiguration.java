package com.meysamzamani.datasynchronizer.configuration;

import com.meysamzamani.datasynchronizer.domain.customer.Customer;
import com.meysamzamani.datasynchronizer.infrastructure.database.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataSyncConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository repository) {
        return args -> {
            Customer customer1 = new Customer("aut", "cumque", "mckenzie.lela@example.org", "mbwi", "vvxt", "abmz", "ecar", "2", "a");
            Customer customer2 = new Customer("aperiam", "nisi", "juliet62@example.net", "piap", "uhmw", "bnns", "hyac", "7", "pariatur");
            Customer customer3 = new Customer("placeat", "quas", "abshire.joanne@example.org", "jlut", "dosk", "tkrg", "ckqv", "3", "odio");
            Customer customer4 = new Customer("magni", "dicta", "pstehr@example.org", "tkin", "owsf", "msgi", "htcd", "8", "eum");
            Customer customer5 = new Customer("cum", "et", "alexandro93@example.net", "eqcn", "unhi", "mxfz", "zpes", "8", "ab");
            Customer customer6 = new Customer("ad", "tempore", "preston.larson@example.com", "fpqv", "fggw", "nydd", "bywg", "6", "deleniti");
            Customer customer7 = new Customer("enim", "itaque", "herbert30@example.com", "abxx", "kocz", "ewdc", "ffjf", "8", "ut");
            Customer customer8 = new Customer("officia", "molestiae", "claudie05@example.com", "bsio", "ccpc", "nqjz", "yjon", "2", "consequuntur");
            Customer customer9 = new Customer("non", "quibusdam", "amckenzie@example.org", "xjed", "mvow", "iqvi", "nkou", "4", "exercitationem");
            Customer customer10 = new Customer("rem", "rem", "keshaun.hilpert@example.org", "ioph", "xctt", "zxle", "dejh", "3", "tempora");
            Customer customer11 = new Customer("vel", "ut", "sconnelly@example.org", "mhdy", "borx", "cojc", "tvni", "5", "earum");
            Customer customer12 = new Customer("illum", "tempora", "danny12@example.com", "tkhx", "oawc", "scnm", "tdml", "1", "aspernatur");
            Customer customer13 = new Customer("quaerat", "quia", "lakin.orlando@example.net", "vlkr", "pflc", "hmte", "ihhu", "4", "architecto");
            Customer customer14 = new Customer("pariatur", "officiis", "kohler.domenick@example.net", "zemj", "cwra", "rlsz", "ynbw", "7", "vitae");
            Customer customer15 = new Customer("sint", "vero", "monique.zboncak@example.net", "jbxq", "lpuz", "wnhu", "hfbq", "3", "dolores");
            Customer customer16 = new Customer("est", "vero", "koss.amparo@example.org", "xvxx", "hmoi", "piic", "uuqw", "3", "cumque");
            Customer customer17 = new Customer("voluptatem", "odio", "aletha21@example.net", "newi", "lotk", "lutl", "ccrr", "9", "odio");
            Customer customer18 = new Customer("magnam", "itaque", "jonathan17@example.com", "afcu", "jrdj", "aejl", "vsrp", "2", "non");
            Customer customer19 = new Customer("rem", "fugiat", "mathilde92@example.com", "xuqs", "onfw", "ntzs", "wmez", "3", "perspiciatis");
            Customer customer20 = new Customer("possimus", "corporis", "bernice.skiles@example.com", "jwlg", "wyvi", "hyce", "gmaq", "3", "pariatur");
            Customer customer21 = new Customer("nemo", "ea", "weber.rudolph@example.net", "ywdk", "dhlz", "gwrl", "ggcb", "5", "reprehenderit");
            Customer customer22 = new Customer("dignissimos", "voluptatum", "hkozey@example.org", "tszb", "grfq", "ikxg", "jwxu", "5", "accusamus");
            Customer customer23 = new Customer("soluta", "vitae", "witting.elisabeth@example.net", "vdoe", "ains", "jfwo", "axcm", "2", "rerum");
            Customer customer24 = new Customer("deserunt", "laborum", "joana.crist@example.org", "sumx", "biix", "nval", "tpyx", "2", "alias");
            Customer customer25 = new Customer("cumque", "eaque", "gcrona@example.org", "xdhf", "udvn", "jhna", "ullg", "1", "ut");
            Customer customer26 = new Customer("eligendi", "aspernatur", "sfay@example.com", "jfto", "ysfp", "glrh", "bbax", "1", "rem");
            Customer customer27 = new Customer("voluptate", "odit", "florencio11@example.org", "qiyn", "jkif", "vwrf", "frhd", "5", "voluptatum");
            Customer customer28 = new Customer("reiciendis", "et", "beahan.foster@example.com", "setx", "jzen", "ruqk", "ujer", "4", "id");
            Customer customer29 = new Customer("fugit", "cum", "nils87@example.net", "hhbr", "ogxh", "girh", "uvvv", "2", "corporis");
            Customer customer30 = new Customer("ab", "at", "sanford.pascale@example.net", "dspx", "sgil", "peag", "oezz", "5", "qui");
            Customer customer31 = new Customer("et", "iste", "desmond.price@example.com", "whvr", "kzrd", "mplk", "jpse", "3", "alias");
            Customer customer32 = new Customer("libero", "rem", "geovanny11@example.com", "snzx", "bylg", "ilgj", "dzst", "2", "deleniti");
            Customer customer33 = new Customer("in", "ullam", "rodriguez.luna@example.org", "umau", "mqqw", "janc", "vqal", "1", "non");
            Customer customer34 = new Customer("voluptate", "eius", "yskiles@example.com", "wfve", "qbbg", "hevt", "hzqx", "7", "voluptas");
            Customer customer35 = new Customer("natus", "officia", "josianne.runte@example.org", "yous", "qmhp", "xdqz", "wrxd", "3", "et");
            Customer customer36 = new Customer("quia", "facere", "holden.auer@example.org", "yyxy", "vlvo", "mhfp", "dcpp", "1", "recusandae");
            Customer customer37 = new Customer("optio", "nobis", "bortiz@example.net", "nmuy", "vbso", "dmni", "vdhl", "8", "accusamus");
            Customer customer38 = new Customer("facilis", "nostrum", "maureen.yundt@example.net", "pjkf", "mzzc", "ajrg", "pidb", "3", "accusamus");
            Customer customer39 = new Customer("qui", "voluptatibus", "haskell.steuber@example.net", "qbtm", "hgns", "ynym", "cgpb", "7", "nostrum");
            Customer customer40 = new Customer("et", "veritatis", "steuber.titus@example.com", "dmxy", "ygav", "hpjj", "ssuh", "6", "quia");
            Customer customer41 = new Customer("nulla", "reprehenderit", "hudson.doug@example.com", "meev", "mnwg", "ctks", "bwyc", "9", "ut");
            Customer customer42 = new Customer("voluptatem", "aliquid", "lakin.susana@example.net", "dkfo", "kswd", "zjvl", "yshk", "5", "repellendus");
            Customer customer43 = new Customer("eligendi", "nemo", "stephanie14@example.net", "dgps", "trgx", "smgy", "xuhs", "7", "maiores");
            Customer customer44 = new Customer("et", "laborum", "maybelle52@example.org", "azas", "qlsn", "rwke", "cmsf", "5", "ea");
            Customer customer45 = new Customer("sapiente", "aut", "tmitchell@example.net", "mgjf", "qeeu", "xuep", "fdnw", "6", "nisi");
            Customer customer46 = new Customer("fuga", "est", "gabriel56@example.com", "rtoe", "oini", "phdt", "rbne", "7", "facere");
            Customer customer47 = new Customer("reprehenderit", "in", "nwyman@example.net", "xvcf", "jxvl", "heaj", "ffqc", "7", "autem");
            Customer customer48 = new Customer("ipsa", "est", "shakira64@example.com", "yhpb", "fcmd", "gkwa", "ouma", "8", "et");
            Customer customer49 = new Customer("officia", "corporis", "maverick.treutel@example.net", "owem", "enrs", "rlxu", "gbfo", "7", "sit");
            Customer customer50 = new Customer("eaque", "expedita", "una66@example.net", "szpc", "zucb", "wjqg", "nrga", "2", "inventore");
            Customer customer51 = new Customer("cumque", "quos", "diana71@example.org", "gpfq", "pptt", "aahv", "izgh", "1", "in");
            Customer customer52 = new Customer("explicabo", "qui", "satterfield.daryl@example.org", "byyu", "kmmv", "lepk", "ugcv", "9", "reprehenderit");
            Customer customer53 = new Customer("ab", "reprehenderit", "mina93@example.org", "rcmr", "gfly", "wtcg", "upfc", "7", "beatae");
            Customer customer54 = new Customer("delectus", "voluptatem", "monahan.shakira@example.net", "ciwn", "pdlk", "vtnp", "zmiw", "7", "deleniti");
            Customer customer55 = new Customer("consectetur", "sint", "xhand@example.org", "teje", "dyyt", "tvsk", "uhin", "1", "repudiandae");
            Customer customer56 = new Customer("illum", "cum", "floy.deckow@example.com", "undo", "krqe", "lueo", "bnac", "8", "ducimus");
            Customer customer57 = new Customer("dignissimos", "soluta", "laney.schaefer@example.com", "kxuo", "ujru", "ueeh", "jyco", "5", "sunt");
            Customer customer58 = new Customer("laborum", "ea", "anibal53@example.com", "oxzu", "hivb", "ijih", "inbk", "2", "voluptate");
            Customer customer59 = new Customer("quisquam", "sed", "lacy76@example.com", "bhra", "gpca", "ytbe", "odbc", "7", "atque");
            Customer customer60 = new Customer("similique", "rerum", "madeline.breitenberg@example.net", "oton", "umdm", "rhrr", "eoil", "5", "dolore");
            Customer customer61 = new Customer("est", "aliquam", "cruz43@example.net", "pvnw", "karl", "erqn", "efbp", "9", "illo");
            Customer customer62 = new Customer("placeat", "nulla", "sammy.kub@example.net", "tfew", "jbgy", "qknr", "fmog", "7", "iste");
            Customer customer63 = new Customer("aliquam", "praesentium", "considine.jazmyne@example.org", "anww", "zuqq", "dgfs", "qbrv", "7", "aperiam");
            Customer customer64 = new Customer("similique", "aut", "lenore.fritsch@example.net", "wixh", "etru", "qlvz", "ccbi", "2", "eius");
            Customer customer65 = new Customer("incidunt", "est", "annabelle18@example.org", "vtik", "ipyo", "zlht", "pqlq", "6", "ipsam");
            Customer customer66 = new Customer("laboriosam", "laboriosam", "durgan.alyce@example.net", "phes", "kafq", "cvtv", "uhct", "7", "autem");
            Customer customer67 = new Customer("voluptates", "nihil", "vdenesik@example.net", "ahfu", "zkog", "nqcc", "dsep", "9", "ducimus");
            Customer customer68 = new Customer("ratione", "libero", "pkozey@example.org", "wlrh", "jgyz", "rwwc", "bihe", "4", "omnis");
            Customer customer69 = new Customer("aut", "corrupti", "chanel.volkman@example.com", "qgjg", "gaxe", "etzc", "xsru", "8", "itaque");
            Customer customer70 = new Customer("aut", "necessitatibus", "marley.gleichner@example.net", "kawz", "dfio", "miaw", "wgbv", "5", "officia");
            Customer customer71 = new Customer("ipsa", "consequatur", "lelia.kertzmann@example.com", "bvoc", "odbw", "uxuu", "kxwm", "9", "et");
            Customer customer72 = new Customer("quo", "magnam", "madisen.fadel@example.net", "ujmc", "eahs", "fuyi", "emer", "2", "rerum");
            Customer customer73 = new Customer("consequuntur", "qui", "darrick.schneider@example.org", "oecw", "cmrm", "dyla", "godr", "4", "dolorem");
            Customer customer74 = new Customer("cum", "eum", "fkutch@example.com", "enyh", "ilmz", "isfd", "vxbg", "6", "minima");
            Customer customer75 = new Customer("officiis", "veritatis", "mikel.farrell@example.com", "htre", "qtgf", "bjmc", "qeza", "3", "temporibus");
            Customer customer76 = new Customer("amet", "quo", "sid43@example.org", "ueyp", "xppm", "ytcw", "unrq", "9", "dolor");
            Customer customer77 = new Customer("autem", "error", "bernhard16@example.org", "hdfk", "wjfb", "lrrn", "mnbr", "1", "tempore");
            Customer customer78 = new Customer("qui", "dolores", "mlubowitz@example.net", "ztgo", "tqzd", "toko", "kwiv", "5", "quia");
            Customer customer79 = new Customer("sed", "enim", "annette18@example.com", "lgfn", "jyja", "dkgr", "jpaa", "7", "suscipit");
            Customer customer80 = new Customer("et", "animi", "shanny.gerlach@example.com", "xkjr", "hpml", "rdee", "ihtj", "5", "aliquid");
            Customer customer81 = new Customer("ut", "ut", "smith.serena@example.com", "jbdp", "zrqk", "lplf", "wqhc", "1", "placeat");
            Customer customer82 = new Customer("sit", "nostrum", "al.steuber@example.org", "bcrr", "fzou", "qegh", "jrun", "7", "odit");
            Customer customer83 = new Customer("est", "voluptatem", "hansen.keira@example.com", "behx", "pmfe", "fpiv", "hiiq", "3", "earum");
            Customer customer84 = new Customer("nisi", "et", "jluettgen@example.org", "ftyv", "gisw", "nsgq", "nved", "1", "blanditiis");
            Customer customer85 = new Customer("itaque", "sed", "erdman.modesto@example.org", "bale", "ltba", "xkpc", "evrg", "1", "itaque");
            Customer customer86 = new Customer("aut", "eveniet", "fatima43@example.net", "fpcj", "djui", "rdza", "grms", "2", "fugit");
            Customer customer87 = new Customer("aperiam", "qui", "tomas.bernier@example.org", "xpcd", "niln", "ngsu", "wrbb", "7", "repellendus");
            Customer customer88 = new Customer("ad", "dolor", "keagan67@example.org", "rrrb", "aqtc", "hewn", "pybx", "5", "deserunt");
            Customer customer89 = new Customer("magnam", "quam", "bertrand59@example.org", "hpcz", "jnme", "oolt", "fsiw", "6", "repellat");
            Customer customer90 = new Customer("quidem", "odio", "constance66@example.com", "ydav", "sjxp", "kxkv", "dkau", "2", "eos");
            Customer customer91 = new Customer("magnam", "ut", "jmccullough@example.org", "cxdh", "pvrb", "hrps", "bvzl", "4", "vitae");
            Customer customer92 = new Customer("repudiandae", "fugit", "jovan36@example.com", "cawi", "luni", "wmxh", "khag", "7", "repellat");
            Customer customer93 = new Customer("voluptates", "id", "dustin.marvin@example.com", "phtx", "knub", "gwij", "wfkl", "5", "est");
            Customer customer94 = new Customer("voluptates", "modi", "rex.zieme@example.com", "anwl", "yqvi", "arqs", "pocs", "1", "ducimus");
            Customer customer95 = new Customer("nulla", "est", "gisselle75@example.com", "nway", "hegf", "quss", "uonk", "7", "esse");
            Customer customer96 = new Customer("repellendus", "excepturi", "khuels@example.com", "pnip", "jeqk", "jpde", "pmfo", "4", "assumenda");
            Customer customer97 = new Customer("tempora", "similique", "uharber@example.org", "xqck", "sltb", "pmnt", "ties", "6", "quis");
            Customer customer98 = new Customer("fuga", "repellendus", "stephon72@example.com", "wdbb", "auas", "xvvd", "ajbn", "2", "est");
            Customer customer99 = new Customer("voluptatibus", "placeat", "pearline73@example.org", "vdkd", "rgzb", "wpff", "xqfk", "1", "sit");
            Customer customer100 = new Customer("voluptas", "sunt", "katelyn79@example.org", "kabo", "plip", "deie", "hfjp", "6", "ut");

            repository.saveAll(List.of(customer1, customer2, customer3, customer4, customer5, customer6, customer7, customer8, customer9, customer10));
            repository.saveAll(List.of(customer11, customer12, customer13, customer14, customer15, customer16, customer17, customer18, customer19, customer20));
            repository.saveAll(List.of(customer21, customer22, customer23, customer24, customer25, customer26, customer27, customer28, customer29, customer30));
            repository.saveAll(List.of(customer31, customer32, customer33, customer34, customer35, customer36, customer37, customer38, customer39, customer40));
            repository.saveAll(List.of(customer41, customer42, customer43, customer44, customer45, customer46, customer47, customer48, customer49, customer50));
            repository.saveAll(List.of(customer51, customer52, customer53, customer54, customer55, customer56, customer57, customer58, customer59, customer60));
            repository.saveAll(List.of(customer61, customer62, customer63, customer64, customer65, customer66, customer67, customer68, customer69, customer70));
            repository.saveAll(List.of(customer71, customer72, customer73, customer74, customer75, customer76, customer77, customer78, customer79, customer80));
            repository.saveAll(List.of(customer81, customer82, customer83, customer84, customer85, customer86, customer87, customer88, customer89, customer90));
            repository.saveAll(List.of(customer91, customer92, customer93, customer94, customer95, customer96, customer97, customer98, customer99, customer100));
        };
    }

}
