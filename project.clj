(defproject storm-deploy "0.0.6-SNAPSHOT"
  :source-paths ["src/clj"]
  :test-paths ["test/clj"]
  :profiles {
    :dev {
      :resource-paths ["conf"]
      :plugins [[com.palletops/pallet-lein "0.8.0-alpha.1"]]
    }
    :pallet {:dependencies [[com.palletops/pallet "0.8.0-RC.11"]]}
  }
  :aliases {"deploy-storm" ["run" "-m" "backtype.storm.provision"]}

  :repositories {
                 "sonatype" "https://oss.sonatype.org/content/repositories/releases"
                 "jclouds-snapshot" "https://oss.sonatype.org/content/repositories/snapshots"
                 }

  :dependencies [
                 [org.apache.storm/storm-core "0.9.4"]
                 [commons-codec "1.4"]

                 [com.jcraft/jsch.agentproxy.usocket-jna "0.0.5"]
                 [com.jcraft/jsch.agentproxy.usocket-nc "0.0.5"]
                 [com.jcraft/jsch.agentproxy.sshagent "0.0.5"]
                 [com.jcraft/jsch.agentproxy.pageant "0.0.5"]
                 [com.jcraft/jsch.agentproxy.core "0.0.5"]
                 [com.jcraft/jsch.agentproxy.jsch "0.0.5"]
                 [com.jcraft/jsch "0.1.49"]
                 [org.apache.jclouds.driver/jclouds-sshj "1.7.3"]
                 [org.apache.jclouds.provider/aws-ec2 "1.7.3"]
                 [org.apache.jclouds.provider/aws-s3 "1.7.3"]

                 [log4j/log4j "1.2.14"]
                 [jvyaml "1.0.0"]]

;  :dev-dependencies [[swank-clojure "1.3.0"]
;                     [org.cloudhoist/pallet-lein "0.5.2"]]
  :min-lein-version "2.0.0")
