import React, { Component } from 'react';
import ArticleList from '../../components/article/ArticleList.js';
import Request from '../../helpers/Request.js';

class ArticleListContainer extends Component {
  constructor(props) {
    super(props);
    this.state = {articles: []}
    console.log("ArticleListContainer", props);
  }

  componentDidMount() {
    let request = new Request()
    request.get('/api/articles').then((data) => {
      this.setState({articles: data._embedded.articles})
    })
  }

  render() {
    return (
      <ArticleList articles = {this.state.articles} />
    )
  }
}

export default ArticleListContainer;
