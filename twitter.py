import tweepy

consumer_key = "B4PbUyBHiQbch0VxFSKB2tWJf"
consumer_secret = "SbSc0v79lRYKJdzN8IDFZ3gXRKnI9DpFxOVf3mtsg3uEHJBVHN"
access_token = "3020843641-cibXWf5cW8xCXoBTw2CUId6jIcb1jfhap5mJndJ"
access_token_secret = "nYZHd4NxNemcvmjvBQtIriGyUWB6tLvJMn4T354G3pCax"

auth = tweepy.OAuthHandler(consumer_key,consumer_secret)

auth.set_access_token(access_token,access_token_secret)

api = tweepy.API(auth)

public_tweets = api.home_timeline()

for tweet in public_tweets:
	print (tweet.text)
