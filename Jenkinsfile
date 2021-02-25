#!groovy

pipeline {
  agent any
  options {
    buildDiscarder logRotator(daysToKeepStr: '14', numToKeepStr: '10')
    timeout(140)
    disableConcurrentBuilds()
    skipStagesAfterUnstable()
    quietPeriod(30)
  }
  triggers {
    pollSCM 'H/15 * * * *'
  }
  stages {
    stage('Build') {
      matrix {
        stages {
          stage('JDK specific build') {
            tools {
              jdk "11"
            }
            stages {
              stage('Build & Test') {
                steps {
                  sh 'mvn -B clean install'
                  // step([$class: 'JiraIssueUpdater', issueSelector: [$class: 'DefaultIssueSelector'], scm: scm])
                }
               // post {
               //     always {
               //       junit(testResults: '**/surefire-reports/*.xml', allowEmptyResults: true)
               //       junit(testResults: '**/failsafe-reports/*.xml', allowEmptyResults: true)
               //     }
               // }
             }
          }
        }
      }
    }
  }
}
}
