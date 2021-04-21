# ex curl that exercises /post-handler to give
curl -H "Content-Type:application/json" \
  -b "one=lksdjf" \
  -X POST "http://localhost:3000/post-handler/path-param-1?qp=kt" \
  -d '{"field": "value"}'