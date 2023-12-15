# SpringBootアプリでセッションをRedisに保持するサンプル

## 構成
clients  
┃  
web1(nginx)  
┣━ ap1(SpringBoot) ━┓    
┗━ ap2(SpringBoot) ━ redis1

## 起動
```shell
# Javaビルド
./gradlew webapp-java-sample:build

# コンテナビルド
docker compose up
```

## アクセス
http://localhost/
