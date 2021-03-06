import React, { Component } from 'react';
import ArticleList from '../../components/article/ArticleList.js';
import Request from '../../helpers/Request.js';
import './ArticleListContainer.css';

class ArticleListContainer extends Component {
  constructor(props) {
    super(props);
    this.state = {articles: []}
  }

  componentDidMount() {
    let request = new Request()
    request.get('/articles/').then((data) => {
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
