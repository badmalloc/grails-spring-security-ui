grails.project.work.dir = 'target'
grails.project.docs.output.dir = 'docs/manual' // for backwards-compatibility, the docs are checked into gh-pages branch

grails.project.dependency.resolver = "maven"
grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		grailsPlugins()
		grailsHome()
		grailsCentral()

		mavenLocal()
		mavenCentral()
		mavenRepo 'http://download.java.net/maven/2/'
		mavenRepo "http://repo.spring.io/milestone/"
	}

	plugins {
//		build ":tomcat:7.0.42"

		compile ':spring-security-core:2.0-RC2'
		compile ':mail:1.0.1'
		compile ':jquery:1.10.2'
		compile ':jquery-ui:1.8.24'
		compile ':famfamfam:1.0.1'
	}
}
