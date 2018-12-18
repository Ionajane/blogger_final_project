import React from 'react';
import Article from './Article.js';

const ArticleList = (props) => {
  const articles = props.articles.map((article) => {
    return (
      <li key={article.id} className="article-component-item">
        <div className= "article-component">
          <Article journalist={article.journalist} article={article} />
        </div>
      </li>
    )
  })

  return (
    <ul className="article-component-item">
    {articles}
    </ul>
  )
}

export default ArticleList;
