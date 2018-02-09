package com.yunjinrong;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.util.CollectionUtils;



/**
 * 生成mybaits相关mapper,bean,dao等
 * @author ZWG
 *
 */
public class MybatisGenerateRun {
    public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
       List<String> warnings = new ArrayList<String>();
       boolean overwrite = true;
       //加载generatorEmallConfig文件
       File configFile = new File(MybatisGenerateRun.class.getClassLoader().getResource("generatorConfig.xml").getPath());
       //加载数据库信息，例如driverClassName，username,password,url等
       Properties extraProperties = PropertiesLoaderUtils.loadAllProperties("mybatis-emall.properties");
       ConfigurationParser cp = new ConfigurationParser(extraProperties, warnings);
       Configuration config = cp.parseConfiguration(configFile);
       DefaultShellCallback callback = new DefaultShellCallback(overwrite);
       MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
       myBatisGenerator.generate(null);
       if(!CollectionUtils.isEmpty(warnings)){
           for (String warn : warnings) {
            System.out.println(warn);
        }
       }
       System.out.println("生成成功！");
    }
}
