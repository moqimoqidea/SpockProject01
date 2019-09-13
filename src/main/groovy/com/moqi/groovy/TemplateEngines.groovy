package com.moqi.groovy

import groovy.text.SimpleTemplateEngine

/**
 * Groovy 模板引擎
 * https://www.w3cschool.cn/groovy/groovy_template_engines.html
 * @author wenbo17* On 8/25/19 16:59
 */

// 字符串中的简单模板
def name = "Groovy"
println "This Tutorial is about ${name}"


// 简单模板引擎
def text = 'This Tutorial focuses on $TutorialName. In this tutorial you will learn about $Topic'
def binding = ["TutorialName":"Groovy", "Topic":"Templates Engines"]
def engine = new SimpleTemplateEngine()
def template = engine.createTemplate(text).make(binding)

println template