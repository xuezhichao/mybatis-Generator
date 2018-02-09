package com.yunjinrong;

import java.util.Properties;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.InnerEnum;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.springframework.util.StringUtils;

/**
 * 自定义Mybatis注释 使用数据库中的注释
 * 
 * @author ZWG
 *
 */
public class MybatisGeneratorCommon implements CommentGenerator {

	public void addConfigurationProperties(Properties properties) {
	}

	public void addFieldComment(Field field, IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {
		// 判断数据库中该字段注释是否为空
		if (StringUtils.isEmpty(introspectedColumn.getRemarks()))
			return;
		field.addJavaDocLine("/**" + introspectedColumn.getRemarks() + "*/");
	}

	public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
	}

	public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
	}

	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
	}

	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
	}

	public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {
	}

	public void addGetterComment(Method method, IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {
		if (StringUtils.isEmpty(introspectedColumn.getRemarks()))
			return;
		method.addJavaDocLine("/**获取" + introspectedColumn.getRemarks() + "*/");
	}

	public void addSetterComment(Method method, IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {
		if (StringUtils.isEmpty(introspectedColumn.getRemarks()))
			return;
		method.addJavaDocLine("/**设置" + introspectedColumn.getRemarks() + "*/");
	}

	public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
	}

	public void addJavaFileComment(CompilationUnit compilationUnit) {
	}

	public void addComment(XmlElement xmlElement) {
	}

	public void addRootComment(XmlElement rootElement) {
	}

}